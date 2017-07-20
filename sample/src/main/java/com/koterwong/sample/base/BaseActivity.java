/*
 * BaseActivity     2016/9/26-09-26
 * Copyright (c) 2016 KOTERWONG All right reserved
 */
package com.koterwong.sample.base;

import android.databinding.ViewDataBinding;

import com.koterwong.sample.R;

import me.koterwong.base.BaseAppCompatActivity;
import me.koterwong.mvp.BasePresenter;
import me.koterwong.widget.statusbartint.StatusBarCompat;


/**
 * Created by Koterwong on 2016/9/26 18:51
 */
public abstract class BaseActivity<P extends BasePresenter,D extends ViewDataBinding> extends BaseAppCompatActivity<P,D> {
  @Override protected void setStatusBar() {
    StatusBarCompat.setColor(this, getResources().getColor(R.color.colorPrimaryDark));
  }

  @Override protected void setupTitle() {

  }
}
