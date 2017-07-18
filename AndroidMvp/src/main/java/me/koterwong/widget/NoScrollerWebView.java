/*
 * NoScrollerListView     2016/12/16 09:01
 * Copyright (c) 2016 Koterwong All right reserved
 */
package me.koterwong.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.webkit.WebView;

/**
 * Created by Koterwong on 2016/12/16 09:01
 */
public class NoScrollerWebView extends WebView {
  public NoScrollerWebView(Context context) {
    super(context);
  }

  public NoScrollerWebView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public NoScrollerWebView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @TargetApi(Build.VERSION_CODES.LOLLIPOP)
  public NoScrollerWebView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
  }

  @Override
  public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
    super.onMeasure(widthMeasureSpec, expandSpec);
  }
}
