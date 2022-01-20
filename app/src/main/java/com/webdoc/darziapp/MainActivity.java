package com.webdoc.darziapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.webdoc.darziapp.Dashboard.DashboardActivity;

public class MainActivity extends AppCompatActivity {

    Handler call_time_handler = new Handler();
    Runnable runnable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        call_time_handler.postDelayed(runnable = new Runnable() {
            public void run() {
                //do something

                Intent intent = new Intent(MainActivity.this, DashboardActivity.class);
                startActivity(intent);
                call_time_handler.removeCallbacks(null);

            }
        }, 5000);

    }
}