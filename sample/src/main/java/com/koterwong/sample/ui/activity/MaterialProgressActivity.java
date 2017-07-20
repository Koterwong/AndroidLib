package com.koterwong.sample.ui.activity;

import com.koterwong.sample.R;
import com.koterwong.sample.base.BaseActivity;

import me.koterwong.di.component.AppComponent;
import me.koterwong.widget.MaterialProgressView;


public class MaterialProgressActivity extends BaseActivity {
  MaterialProgressView mProgressView;

  @Override protected int getLayoutId() {
    return R.layout.activity_material_progress;
  }

  @Override protected void injectComponent(AppComponent appComponent) {
    mProgressView = (MaterialProgressView) findViewById(R.id.mp_view);
  }
}
