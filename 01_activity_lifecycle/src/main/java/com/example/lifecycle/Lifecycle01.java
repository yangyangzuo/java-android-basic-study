package com.example.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Lifecycle01 extends AppCompatActivity {

    //一个activity创建，启动，并显示在屏幕上时，依次执行
    //onCreate(),onStart(),onResume()
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lifecycle01);

        System.out.println("-------------------onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        System.out.println("------------------onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        System.out.println("------------------onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        //当另一个activity被激活，准备显示到屏幕上时，执行该方法
        //此时，另一个activity还没有创建，只是发出信号，准备创建另一个activity显示在屏幕上
        //当前的activity会暂停，然后执行另一个activity的onCreate(),onStart(),onResume()
        System.out.println("------------------onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();

        //如果另一个activity,创建并执行成功了(create,start,resume),
        //而且，当前的这个activity完全被另一个activity遮挡住了，
        // 即:当前的activity在屏幕上已经完全不可见了，则此时，当前的这个activity就会onStop()
        System.out.println("------------------onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        System.out.println("------------------onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        System.out.println("------------------onRestart");
    }
}

//https://developer.android.google.cn/reference/android/app/Activity#ActivityLifecycle

/*
    android手机中的3个键:
    方框键: 菜单键/任务键，列出最近打开的程序列表
    圆形键: home键盘/桌面键，返回桌面(不一定是主屏桌面)
    箭头键: 返回键/退出键, 返回上一个activity或者退出当前的app


    单个activity中，通过3个键进行基本操作时的函数调用情况:

    启动后执行:
        onCreate(),
        onStart(),
        onResume()
        程序运行...

    程序运行...此时:
    1.切换到后台:屏幕中键(程序切换到后台)或者方框键(列出后台所有运行的程序列表)
        onPause();
        onStop();当前activity被另一个activity完全遮挡，不可见


        程序重新唤醒(程序在后台运行没有关闭):(屏幕中重新点击程序图标/在运行任务列表中点击该程序)
        onRestart()
        onStart()
        onResume()

    程序运行...此时:
    返回键在这里被程序判定为关闭程序了
    2.返回键,程序隐藏(在方块键中也可能还可以看到该程序)
        onPause()
        onStop()
        onDestroy()

        再次打开程序(方块键中打开/桌面图标中打开)
        onCreate()
        onStart()
        onResume()


    程序运行...此时:
    3.如果直接关闭程序
        (方块键)调用后台所有运行的程序列表，此时程序会切换到后台，执行onPause()和onStop()
        在程序列表中选择该程序，然后滑掉关闭
        模拟器中:此时不会调用onDestroy()方法，而是直接显示Application terminated.
        手机中: 很少出现执行onDestroy(),接着显示Application terminated




*/