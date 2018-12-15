package com.example.gudandan.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //activity表示一个窗体界面,通过setContentView()方法，设置当前页面显示的内容和布局方式
        //R.layout对应着res下的layout目录，res下的目录会自动作为属性被映射到R对象上
        setContentView(R.layout.activity_main);
    }
}
