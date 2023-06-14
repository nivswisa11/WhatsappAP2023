package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button loginButton;
    TextView signupText; // TextView for "Click here"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);
        signupText = findViewById(R.id.signupText); // Initialize TextView

        loginButton.setOnClickListener(view -> {
            if (username.getText().toString().equals("user") && password.getText().toString().equals("1234")) {
                Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "Login Failed!", Toast.LENGTH_SHORT).show();
            }
        });

        signupText.setOnClickListener(view -> {
            // Start Register activity when "Click here" is clicked
            Intent intent = new Intent(MainActivity.this, Register.class);
            startActivity(intent);
        });
    }
}