package com.webdoc.darziapp.Dashboard.Measurments;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.webdoc.darziapp.R;
import com.webdoc.darziapp.databinding.ActivityGetMeasurmentsBinding;

public class GetMeasurmentsActivity extends AppCompatActivity {

    ActivityGetMeasurmentsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityGetMeasurmentsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}