package com.brewing_companies.activities;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.brewing_companies.R;
import com.brewing_companies.model.BrewingDetails;

public class BrewDetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brewing_details);
        BrewingDetails brewingDetails = (BrewingDetails) getIntent().getSerializableExtra("brewDetailsObj");
        Log.e("BrewDetailsActivity: ", "brewingDetails.name"+brewingDetails.getName());
    }
}
