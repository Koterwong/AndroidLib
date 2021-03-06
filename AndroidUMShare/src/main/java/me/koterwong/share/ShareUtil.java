/*
 * ShareUtil     2016/9/24-09-24
 * Copyright (c) 2016 KOTERWONG All right reserved
 */
package me.koterwong.share;

import android.app.Activity;
import android.graphics.Bitmap;

import com.umeng.socialize.ShareAction;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import com.umeng.socialize.media.UMWeb;

import java.io.File;

/**
 * Created by Koterwong on 2016/9/24 15:51
 * 可分享的类型太多了。详细参考文档：
 * http://dev.umeng.com/social/android/android-update?spm=0.0.0.0.KqkYbb#5_1
 */
public class ShareUtil {
  private static ShareUtil sShareUtil = new ShareUtil();

  public static ShareUtil with() {
    return sShareUtil;
  }

  public void showShareBoardShareImage(Activity activity, String imgUrl) {
    UMImage image = new UMImage(activity, imgUrl);
    showShareImgBoard(activity, image);
  }

  public void showShareBoardShareImage(Activity activity, File imgPath) {
    UMImage image = new UMImage(activity, imgPath);
    showShareImgBoard(activity, image);
  }

  public void showShareBoardShareImage(Activity activity, int imgId) {
    UMImage image = new UMImage(activity, imgId);
    showShareImgBoard(activity, image);
  }

  public void showShareBoardShareImage(Activity activity, Bitmap bitmap) {
    UMImage image = new UMImage(activity, bitmap);
    showShareImgBoard(activity, image);
  }

  public void showShareBoardShareImage(Activity activity, byte[] img_bytes) {
    UMImage image = new UMImage(activity, img_bytes);
    showShareImgBoard(activity, image);
  }

  private void showShareImgBoard(Activity activity, UMImage image) {
    new ShareAction(activity)
        .withText("分享图片")
        .withMedia(image)
        .share();
  }

  public void shareQQ(Activity activity, String text, UMImage umImage, String url, UMShareListener umShareListener) {
    new ShareAction(activity)
        .setPlatform(SHARE_MEDIA.QQ)
        .withMedia(umImage)
        .setCallback(umShareListener)
        .share();
  }


  public void shareQzone(Activity activity, String text, String url, UMShareListener umShareListener) {
    UMWeb web = new UMWeb(url);
    web.setTitle(text);
    new ShareAction(activity)
        .setPlatform(SHARE_MEDIA.QZONE)
        .withMedia(web)
        .setCallback(umShareListener)
        .share();
  }

  public void shareWx(Activity activity, String text, String url, UMShareListener umShareListener) {
    UMWeb web = new UMWeb(url);
    web.setTitle(text);
    new ShareAction(activity)
        .setPlatform(SHARE_MEDIA.WEIXIN_CIRCLE)
        .withMedia(web)
        .setCallback(umShareListener)
        .share();
  }

  public void shareSina(Activity activity, String text, String url, UMShareListener umShareListener) {
    UMWeb web = new UMWeb(url);
    web.setTitle(text);
    new ShareAction(activity)
        .setPlatform(SHARE_MEDIA.SINA)
        .withMedia(web)
        .setCallback(umShareListener)
        .share();
  }
}
