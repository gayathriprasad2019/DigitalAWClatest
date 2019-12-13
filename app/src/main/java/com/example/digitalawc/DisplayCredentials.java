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


           }

    public void processSignInLinkClickDisplay(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}
