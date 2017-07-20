/*
 * BaseActivity     2016/9/26-09-26
 * Copyright (c) 2016 KOTERWONG All right reserved
 */
package com.koterwong.sample.base;

import android.databinding.ViewDataBinding;

import com.jaeger.library.StatusBarUtil;

import me.koterwong.base.BaseAppCompatActivity;
import me.koterwong.mvp.BasePresenter;


/**
 * Created by Koterwong on 2016/9/26 18:51
 */
public abstract class BaseActivity<P extends BasePresenter,D extends ViewDataBinding> extends BaseAppCompatActivity<P,D> {
  @Override protected void setStatusBar() {
    StatusBarUtil.setTranslucent(this);
  }

  @Override protected void setupTitle() {

  }
}
