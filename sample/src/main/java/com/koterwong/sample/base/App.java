/*
 * BaseApplication     2016/9/20-09-20
 * Copyright (c) 2016 KOTERWONG All right reserved
 */
package com.koterwong.sample.base;

import com.koterwong.sample.R;
import com.koterwong.sample.api.ApiService;

import me.koterwong.base.BaseApplication;
import me.koterwong.net.GlobeHttpHandler;
import me.koterwong.share.ShareInterface;
import me.koterwong.share.ShareKey;
import me.koterwong.widget.stateview.StateViewMgr;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;


/**
 * Created by Koterwong on 2016/9/20 19:45
 *
 * 适合初始化一些第三方框架，和该项目中要使用的东西。
 */
public class App extends BaseApplication {

  @Override public void onCreate() {
    super.onCreate();
    ShareInterface.init(this, getShareKey());

    StateViewMgr.BASE_VIEW_EMPTY_ID = R.layout.base_empty;
    StateViewMgr.BASE_VIEW_RETRY_ID = R.layout.base_retry;
    StateViewMgr.BASE_VIEW_LOADING_ID = R.layout.base_loading;
  }

  private ShareKey getShareKey() {
    return new ShareKey.Builder()
        .qqKey("1105474989")
        .qqSecret("zyVEkvUeZ8mGv5vB")
        .build();
  }

  @Override protected GlobeHttpHandler getHttpHandler() {
    return new GlobeHttpHandler(){
      @Override public Request onHttpRequestBefore(Request request){
        return request;
      }

      @Override public Response onHttpResultResponse(String httpResult, Interceptor.Chain chain, Response response){
        return response;
      }
    };
  }

  @Override protected HttpUrl getHttpUrl() {
    return HttpUrl.parse(ApiService.BASE_URL);
  }
}
