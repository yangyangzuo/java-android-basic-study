package com.example.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Lifecycle02_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lifecycle02_2);

        System.out.println("------------02-------onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        System.out.println("------------02------onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        System.out.println("------------02------onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        System.out.println("------------02------onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();

        System.out.println("-------------02-----onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        System.out.println("-------------02-----onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        System.out.println("-------------02-----onRestart");
    }
}
