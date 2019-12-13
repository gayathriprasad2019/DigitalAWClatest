package com.example.digitalawc;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    private static int Splash_Screen_Time_Out = 2000;

    //After completion of 2000 ms, the next activity will get started
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //This method is used so that your splash activity can cover the entire screen.
        setContentView(R.layout.activity_welcome);
        ImageView logo = findViewById(R.id.imageView);
        logo.setImageResource(R.drawable.awc_logo);
        //this will bind your MainActivity.class file with activity_main.
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
                //Intent is used to switch from one activity to another.
                startActivity(intent);
                //invoke the SecondActivity
                finish();
            }
            //the current activity will get finished.
        }, Splash_Screen_Time_Out);
    }
}

