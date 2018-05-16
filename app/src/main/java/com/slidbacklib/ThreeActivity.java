package com.slidbacklib;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.slidbacklib.utils.SlideBackLayoutUtils;

/**
 * ===============================
 * 描    述：
 * 作    者：pjw
 * 创建日期：2017/12/26 16:06
 * ===============================
 */
public class ThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        SlideBackLayoutUtils.sideBack(this);
    }

    @Override
    protected void onDestroy() {
        SlideBackLayoutUtils.onDestroy(this);
        super.onDestroy();
    }
}
