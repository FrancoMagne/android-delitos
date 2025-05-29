package com.example.app_delitos.activities;

import android.os.Bundle;

import com.example.app_delitos.R;
import com.example.app_delitos.databinding.ActivityRecordBinding;

public class RecordActivity extends BaseActivity {

    private ActivityRecordBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRecordBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_record);
    }
}