package com.ranzan.and03unit_2c_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private EditText emailID;
    private EditText password;
    private Button btnLogin;
    private CheckBox checkBox;
    private String checkMail = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initViews();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isValidEmail() && isValidPassword()) {
                    Intent intent = new Intent(LoginActivity.this, HomeScreenActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

    private boolean isValidPassword() {
        if (password.getText().toString().length() >= 6)return true;
        else password.setError("Password is very sort");
        return false;
    }

    private boolean isValidEmail() {
        if (emailID.getText().toString().matches(checkMail)) return true;
        else emailID.setError("InValid Email");
        return false;
    }

    private void initViews() {
        emailID = findViewById(R.id.etEmail);
        password = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        checkBox = findViewById(R.id.checkbox);
    }
}