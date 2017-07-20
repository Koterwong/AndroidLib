package com.koterwong.sample.ui.activity;

import android.view.View;

import com.koterwong.sample.R;
import com.koterwong.sample.base.BaseActivity;

import me.koterwong.di.component.AppComponent;
import me.koterwong.widget.MaterialProgressView;


public class MaterialProgressActivity extends BaseActivity {
  MaterialProgressView mProgressView;

  private boolean is_refresh = true;

  @Override protected int getLayoutId() {
    return R.layout.activity_material_progress;
  }

  @Override protected void injectComponent(AppComponent appComponent) {
    mProgressView = (MaterialProgressView) findViewById(R.id.mp_view);
    mProgressView.startAnimation();
  }

  @Override protected void initField(){
      mProgressView.setOnClickListener(new View.OnClickListener(){
        @Override public void onClick(View v){
          if(is_refresh)
            mProgressView.stopAnimation();
          else
            mProgressView.startAnimation();

          is_refresh = !is_refresh;
        }
      });
  }
}
