package com.example.anupmrzn.logapp;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.Button;
import android.annotation.SuppressLint;
 import android.graphics.Color;
 import android.text.Editable;
 import android.text.TextUtils;
 import android.util.Log;
 import android.view.MotionEvent;
 import android.view.View;
 import android.widget.Button;
 import android.widget.Toast;

import java.nio.file.attribute.PosixFilePermissions;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText mUsername;
    private TextInputEditText mPassword;
    private Button login;


    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUsername = findViewById(R.id.username);


        mUsername.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.d("MainActivity before", s.toString());
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("MainActivity onText", s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d("MainActivity after", s.toString());

            }
        });

        mPassword = findViewById(R.id.password);
        mPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.d("MainActivity before", s.toString());
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("MainActivity onText", s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d("MainActivity after", s.toString());

            }
        });

        login = findViewById(R.id.Login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "SUCCESS", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void validateUsername(String Username) {
        if (TextUtils.isEmpty(Username)) {
            mUsername.setError("INPUT USERNAME");
            login.setEnabled(false);
        } else {
            mUsername.setError(null);
            login.setEnabled(true);
        }
    }

    public void validatePassword(String password) {
        if (TextUtils.isEmpty(password)) {
            mPassword.setError("Input Password");
            login.setEnabled(false);

        } else {
            mPassword.setError(null);
            login.setEnabled(true);
        }
    }
}





