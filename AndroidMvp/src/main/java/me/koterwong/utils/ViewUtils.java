package me.koterwong.utils;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/**
 * Created by Koterwong on 2017/4/1 08:06
 */
public class ViewUtils {
  /*
  EditText不能输入表情的
   */
  public static class TextNoEmojiWatcher implements TextWatcher {
    private EditText et;

    public TextNoEmojiWatcher(EditText et) {
      this.et = et;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
      // i("s:" + s);
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
      // e("s:" + s + "  start:" + start + " before:" + before + " count:" + count);
      //输入的类容
      CharSequence input = s.subSequence(start, start + count);
      //e("输入信息:" + input);
      // 退格
      if (count == 0) return;

      //如果 输入的类容包含有Emoji
      if (isEmojiCharacter(input)) {
        //那么就去掉
        et.setText(removeEmoji(s));
      }

      //如果输入的字符超过最大限制,超出的部分 砍掉~
      if (s.length() > 3) {
        et.setText(s.subSequence(0, start));
      }
      //最后光标移动到最后 TODO 这里可能会有更好的解决方案
      et.setSelection(et.getText().toString().length());

    }

    @Override
    public void afterTextChanged(Editable s) {
      // d("s:" + s);
    }


    /**
     * 去除字符串中的Emoji表情
     *
     * @param source
     * @return
     */
    private String removeEmoji(CharSequence source) {
      String result = "";
      for (int i = 0; i < source.length(); i++) {
        char c = source.charAt(i);
        if (isEmojiCharacter(c)) {
          continue;
        }
        result += c;
      }
      return result;
    }


    /**
     * 判断一个字符串中是否包含有Emoji表情
     *
     * @param input
     * @return true 有Emoji
     */
    private boolean isEmojiCharacter(CharSequence input) {
      for (int i = 0; i < input.length(); i++) {
        if (isEmojiCharacter(input.charAt(i))) {
          return true;
        }
      }
      return false;
    }

    /**
     * 是否是Emoji 表情,抄的那哥们的代码
     *
     * @param codePoint
     * @return true 是Emoji表情
     */
    private boolean isEmojiCharacter(char codePoint) {
      // Emoji 范围
      boolean isScopeOf = (codePoint == 0x0) || (codePoint == 0x9) || (codePoint == 0xA) || (codePoint == 0xD)
          || ((codePoint >= 0x20) && (codePoint <= 0xD7FF) && (codePoint != 0x263a))
          || ((codePoint >= 0xE000) && (codePoint <= 0xFFFD))
          || ((codePoint >= 0x10000) && (codePoint <= 0x10FFFF));

      return !isScopeOf;
    }
  }

  /***
   * 输入价格的EditText
   */
  public static class TextDecimalWatcher implements TextWatcher {
    private EditText editText;
    private int length = 0;

    /**
     * @param length 小数点位数
     */
    TextDecimalWatcher(EditText editText, int length) {
      this.editText = editText;
      this.length = length;
    }

    @Override
    public void afterTextChanged(Editable arg0) {
    }

    @Override
    public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
      if (s.toString().contains(".")) {
        if (s.length() - 1 - s.toString().indexOf(".") > length) {
          s = s.toString().subSequence(0, s.toString().indexOf(".") + length + 1);
          editText.setText(s);
          editText.setSelection(s.length());
        } else {
        }
      } else {
      }

      if (s.toString().trim().equals(".")) { //又只有一个 .
        s = "0" + s;
        editText.setText(s);
        editText.setSelection(2);
      }

      if (s.toString().startsWith("0") && s.toString().trim().length() > 1) {
        if (!s.toString().substring(1, 2).equals(".")) {
          editText.setText(s.subSequence(0, 1));
          editText.setSelection(1);
        } else {
        }
      }

      if (s.toString().trim().endsWith(".")) {
      }
    }
  }
}
