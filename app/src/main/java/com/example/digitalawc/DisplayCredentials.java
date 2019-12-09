package com.example.digitalawc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class DisplayCredentials extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_credentials);

        Toast.makeText(getApplicationContext(),"UserId is your mobile number"+R.id.et_mobile,Toast.LENGTH_LONG)
               .show() ;
        Toast.makeText(getApplicationContext(),"Password"+R.id.et_password,Toast.LENGTH_LONG)
               .show();


    }




}
