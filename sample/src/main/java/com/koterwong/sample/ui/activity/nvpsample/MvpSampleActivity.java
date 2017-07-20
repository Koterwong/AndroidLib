package com.koterwong.sample.ui.activity.nvpsample;

import com.koterwong.sample.R;
import com.koterwong.sample.databinding.ActivityMvpSampleBinding;

import me.koterwong.base.BaseAppCompatActivity;
import me.koterwong.di.component.AppComponent;


public class MvpSampleActivity
    extends BaseAppCompatActivity<MvpSamplePresenter, ActivityMvpSampleBinding>
    implements MvpSampleContract.View {

  @Override protected int getLayoutId() {
    return R.layout.activity_mvp_sample;
  }

  @Override protected void setupTitle() {

  }

  @Override protected void injectComponent(AppComponent appComponent) {
    DaggerMvpSampleComponent.builder()
        .appComponent(appComponent)
        .mvpSampleModule(new MvpSampleModule(this))
        .build()
        .inject(this);
  }

  @Override protected void initField() {

  }

  @Override protected void initData() {
    mPresenter.loadData();
  }

  @Override public void showText(String s) {
    mDataBinding.text.setText(s);
  }
}
