package com.example.app_delitos.activities;

import android.os.Bundle;

import com.example.app_delitos.R;
import com.example.app_delitos.databinding.ActivityMapBinding;

public class MapActivity extends BaseActivity {

    private ActivityMapBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMapBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_map);
    }
}