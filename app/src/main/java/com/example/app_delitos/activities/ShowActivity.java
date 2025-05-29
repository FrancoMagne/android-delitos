package com.example.app_delitos.activities;

import android.os.Bundle;

import com.example.app_delitos.R;
import com.example.app_delitos.databinding.ActivityShowBinding;

public class ShowActivity extends BaseActivity {

    private ActivityShowBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityShowBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_show);
    }
}