/*
 * KwShareInterface     2016/9/25-09-25
 * Copyright (c) 2016 KOTERWONG All right reserved
 */
package me.koterwong.share;

import android.content.Context;

import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.UMShareAPI;

/**
 * Created by Koterwong on 2016/9/25 18:43
 * 初始化QQ 微信 微博 appkey 和安全密钥
 */
public class ShareInterface {
  public static void init(Context context, ShareKey shareKey) {
    PlatformConfig.setWeixin(shareKey.mWxKey, shareKey.mWxSecret);
    PlatformConfig.setSinaWeibo(shareKey.mSinaKey, shareKey.mSinaSecret, "http://sns.whalecloud.com/sina2/callback");
    PlatformConfig.setQQZone(shareKey.mQQKey, shareKey.mQQSecret);

    UMShareAPI.get(context);
  }
}
