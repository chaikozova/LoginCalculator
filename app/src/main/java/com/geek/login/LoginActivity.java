package com.geek.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText email, password;
    private Button btn;
    private String login, pswrd;
    private Drawable btnBackround, btnBackround_gray;
    private TextView back;
    private ConstraintLayout screen;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Log.w("ololo", "onCreate()");

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        btn = findViewById(R.id.btn);
        back = findViewById(R.id.back);
        screen = findViewById(R.id.screen);
        btnBackround = getResources().getDrawable(R.drawable.rounded_btn);
        btnBackround_gray = getResources().getDrawable(R.drawable.rounded_btn_gray);

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                login = email.getText().toString();
                pswrd = password.getText().toString();
                btn.setEnabled(!login.isEmpty() && !pswrd.isEmpty());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                login = email.getText().toString();
                pswrd = password.getText().toString();
                if (!login.isEmpty() && !pswrd.isEmpty()) {
                    btn.setBackground(btnBackround);
                } else {
                    btn.setBackground(btnBackround_gray);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                login = email.getText().toString();
                pswrd = password.getText().toString();
                btn.setEnabled(!login.isEmpty() && !pswrd.isEmpty());

            }
        });

        login = email.getText().toString();
        pswrd = password.getText().toString();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!login.isEmpty() && !pswrd.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Welcome!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(LoginActivity.this, Calculator.class);
                    intent.putExtra("key", login);
                    startActivity(intent);
                }
            }
        });

        back(back);

        screen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LoginActivity.this,
                        "you've touched the screen", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.w("ololo", "onStart()");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w("ololo", "onResart()");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w("ololo", "onResume()");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("ololo", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w("ololo", "onStop()");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w("ololo", "onDestroy()");

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