package com.example.kato_android_application;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.opengl.Visibility;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText staffIDTextInput = null;

    private EditText passwordTextInput = null;

    private Button loginButton = null;

    private MessagePopupBox invalidCredentialsMessagePopupBox = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        App.instance.init(this.getApplicationContext());

        this.staffIDTextInput = this.findViewById(R.id.StaffIDTextInput);

        this.passwordTextInput = this.findViewById(R.id.PasswordTextInput);

        this.loginButton = this.findViewById(R.id.LoginButton);

        this.invalidCredentialsMessagePopupBox = (MessagePopupBox) this.getSupportFragmentManager().findFragmentById(
            R.id.InvalidCredentialsMessagePopupBox
        );

        this.invalidCredentialsMessagePopupBox.setVisibility(INVISIBLE);

        this.loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enteredStaffID = MainActivity.this.staffIDTextInput.getText().toString();

                String enteredPassword = MainActivity.this.passwordTextInput.getText().toString();

                for (User placeholderUser : App.instance.tester.placeholderUsers)
                {
                    if (enteredStaffID == placeholderUser.staffID && enteredPassword == placeholderUser.password)
                    {
                        Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);

                        MainActivity.this.startActivity(intent);

                        return;
                    }

                    MainActivity.this.invalidCredentialsMessagePopupBox.setVisibility(VISIBLE);
                }


            }
        });
    }
}