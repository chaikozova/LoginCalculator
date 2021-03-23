package com.geek.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        Log.d("ololo", "onCreate()");

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ololo", "onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ololo", "onRestart()");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ololo", "onResume()");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ololo", "onPause()");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ololo", "onStop()");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ololo", "onDestroy()");

    }
}