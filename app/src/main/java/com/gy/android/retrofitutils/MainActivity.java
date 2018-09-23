package com.gy.android.retrofitutils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gy.android.retrofitutils2.utils.LoadingUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoadingUtils.init(this);

        LoadingUtils.showMsg("你好");

        LoadingUtils.show("加载中...");
    }
}
