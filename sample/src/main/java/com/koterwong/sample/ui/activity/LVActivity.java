/*
 * LVActivity     2016/9/29-09-29
 * Copyright (c) 2016 KOTERWONG All right reserved
 */
package com.koterwong.sample.ui.activity;

import android.widget.ListView;

import com.koterwong.sample.R;
import com.koterwong.sample.base.BaseActivity;
import com.koterwong.sample.ui.adapter.LvMultiAdaoter;

import java.util.ArrayList;
import java.util.List;

import me.koterwong.di.component.AppComponent;
import me.koterwong.widget.statusbartint.StatusBarCompat;

/**
 * Created by Koterwong on 2016/9/29 10:41
 */
public class LVActivity extends BaseActivity {
  private final List<String> mDatas = new ArrayList<String>();

  {
    mDatas.add("0");
    mDatas.add("1");
    mDatas.add("2");
    mDatas.add("3");
    mDatas.add("4");
    mDatas.add("5");
    mDatas.add("6");
    mDatas.add("7");
    mDatas.add("8");
    mDatas.add("9");
    mDatas.add("10");
    mDatas.add("11");
    mDatas.add("12");
    mDatas.add("13");
    mDatas.add("14");
    mDatas.add("15");
  }

  ListView mListView;


  @Override protected int getLayoutId() {
    return R.layout.activity_lv;
  }

  @Override protected void setStatusBar() {
    StatusBarCompat.setStatusBarImmersive(this);
  }

  @Override protected void injectComponent(AppComponent appComponent) {

  }

  @Override protected void initField() {
    mListView = (ListView) findViewById(R.id.list_item);
  }

  @Override protected void initData() {
    mListView.setAdapter(new LvMultiAdaoter(this, mDatas));
  }
}
