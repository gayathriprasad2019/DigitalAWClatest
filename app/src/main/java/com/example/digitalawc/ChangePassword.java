package com.example.digitalawc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.textservice.TextInfo;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static android.content.Intent.ACTION_PROCESS_TEXT;


public class ChangePassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_password);
    }

    public void processChangePasswordButtonClick(View view) {
        EditText e1=(EditText)findViewById(R.id.et_newpassword);
        EditText e2=(EditText)findViewById(R.id.et_confirmnewpassword);
        if(e1.getText().toString().equals(e2.getText().toString())){
           //TODO update password in DB
            Intent intent = new Intent(this,DisplayCredentials.class);
            startActivity(intent);
            Toast.makeText(getApplicationContext(),"Password Changed Successfully"+R.id.et_mobile,Toast.LENGTH_LONG)
                    .show() ;
        }
        else {
            Toast.makeText(getApplicationContext(),"Passwords does not match",Toast.LENGTH_LONG)
                    .show();

        }


    }


}
