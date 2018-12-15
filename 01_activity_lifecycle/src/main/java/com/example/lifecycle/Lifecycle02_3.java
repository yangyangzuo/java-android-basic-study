package com.example.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Lifecycle02_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lifecycle02_3);
        System.out.println("------------03-------onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        System.out.println("------------03------onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        System.out.println("------------03------onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        System.out.println("------------03------onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();

        System.out.println("-------------03-----onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        System.out.println("-------------03-----onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        System.out.println("-------------03-----onRestart");
    }
}
