package com.example.kato_android_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText staffIDTextInput = null;

    private EditText passwordTextInput = null;

    private Button loginButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        App.instance.init(this.getApplicationContext());

        this.staffIDTextInput = this.findViewById(R.id.StaffIDTextInput);

        this.passwordTextInput = this.findViewById(R.id.PasswordTextInput);

        this.loginButton = this.findViewById(R.id.LoginButton);

        this.loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);

                MainActivity.this.startActivity(intent);
            }
        });
    }
}