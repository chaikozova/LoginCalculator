package com.geek.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    private TextView result ,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        Log.w("ololo", "onCreate() - calculator");

        result = findViewById(R.id.result);
        result.setText(getIntent().getStringExtra("key"));

        back = findViewById(R.id.back);
        back(back);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.w("ololo", "onStart() - calculator");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w("ololo", "onResart() - calculator");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w("ololo", "onResume() - calculator");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("ololo", "onPause() - calculator");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w("ololo", "onStop() - calculator");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w("ololo", "onDestroy() - calculator");

    }


    public void back(View view) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}