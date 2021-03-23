package com.geek.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText email, password;
    private Button btn;
    private String login, pswrd;


    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Log.d("ololo", "onCreate()");

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        btn = findViewById(R.id.btn);

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
                btn.setEnabled(!login.isEmpty() && !pswrd.isEmpty());
            }

            @Override
            public void afterTextChanged(Editable editable) {

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
                    startActivity(intent);
                }
            }
        });

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