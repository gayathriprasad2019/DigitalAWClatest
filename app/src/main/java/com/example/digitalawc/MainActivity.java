package com.example.digitalawc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etUsername = findViewById(R.id.et_userid);
        final EditText etPassword = findViewById(R.id.et_password);
        Button btnLogin = findViewById(R.id.btn_login);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                if (username.equals("user") && password.equals("pass")) {
                    Intent intent = new Intent(getApplicationContext(), UserDashboardActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast
                            .makeText(getApplicationContext(), "InvalidCredentials" + username, Toast.LENGTH_LONG)
                            .show();

                }
            }
        });


    }


    public void processSignUpLinkClick(View view) {
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);
    }

    public void processSignUpLinkClickAdmin(View view) {
        Intent intent = new Intent(this, RegistrationActivityAdmin.class);
        startActivity(intent);
    }

    public void processForgotPasswordLinkClick(View view) {
        Intent intent = new Intent(this, ChangePassword.class);
        startActivity(intent);
    }


}
