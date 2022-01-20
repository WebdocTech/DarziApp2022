package com.webdoc.darziapp.Dashboard;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.webdoc.darziapp.R;
import com.webdoc.darziapp.databinding.ActivityDashboardBinding;

public class DashboardActivity extends AppCompatActivity {

    ImageView iv_menu;
    CardView cv_enter_measurements;
    ActivityDashboardBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDashboardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        iv_menu = findViewById(R.id.iv_menu);
        cv_enter_measurements = findViewById(R.id.cv_enter_measurements);


        iv_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }


}