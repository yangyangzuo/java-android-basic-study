package com.example.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Lifecycle02_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lifecycle02_1);

        findViewById(R.id.mybutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Lifecycle02_1.this,Lifecycle02_2.class));
            }
        });


        findViewById(R.id.mybutton2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Lifecycle02_1.this,Lifecycle02_3.class));
            }
        });


        System.out.println("------------01-------onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        System.out.println("------------01------onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        System.out.println("------------01------onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        System.out.println("------------01------onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();

        System.out.println("-------------01-----onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        System.out.println("-------------01-----onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        System.out.println("-------------01-----onRestart");
    }
}

//https://developer.android.google.cn/reference/android/app/Activity#ActivityLifecycle

/*

    启动执行:
    01--onCreate()
    01--onStart()
    01---onResume()


    1.第一个activity正常显示
    如果此时第一个activity正常显示，
    点击视图中的按钮，打开另一个activity
    执行:

    激活另一个activity，准备显示到视图的最前面时(此时，另一个activity还没有显示)
    01----onPause()

    02---onCreate()
    02---onStart()
    02---onResume()

    此时第二个activity显示，而且已经把当前的视图完全遮挡住了
    换句话说，第一个activity已经不可见了，才会调用第一个activity的onStop()
    01---onStop()





    2.第一个activity正常显示
    如果此时第一个activity正常显示，
    点击视图中的按钮，打开另一个对话框形式的activity
    执行:

    激活另一个activity，准备显示到视图的最前面时(此时，另一个activity还没有显示)
    01----onPause()

    03---onCreate()
    03---onStart()
    03---onResume()

    此时01中的activity的onStop()方法并没有执行，因为打开的activity并没有完全遮住它
    此时在对话框的外部，点鼠标，关闭对话框，执行如下:
    03--onPause
    01---onResume(原先的activity重新显示,而且对话框activity已经完全不可以见，被遮挡住了)

    对话框activity已经完全不可见了，所以被调用了stop方法
    03---onStop
    对话框被关闭调用了destroy方法
    03---onDestroy


*/