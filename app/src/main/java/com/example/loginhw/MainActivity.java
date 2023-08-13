package com.example.loginhw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.util.Log;


import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText usernameEditText, passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // 在这里执行登录逻辑，可以调用后端 API 进行验证，或者进行本地验证

                // 临时示例：检查用户名和密码是否匹配
                if (username.equals("kyle") && password.equals("password")) {
                    Log.d("Login", "Login successful");
                    // 登录成功，跳转到成功界面
                    Intent successIntent = new Intent(MainActivity.this, SuccessActivity.class);
                    startActivity(successIntent);
                } else {
                    Log.d("Login", "Login failed");
                    // 登录失败，跳转到失败界面
                    Intent failureIntent = new Intent(MainActivity.this, FailureActivity.class);
                    startActivity(failureIntent);
                }


            }
        });
    }
}