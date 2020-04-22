package com.brewing_companies.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.brewing_companies.R;
import com.brewing_companies.adapters.BrewingAdapter;
import com.brewing_companies.api.BrewingServiceGenerator;
import com.brewing_companies.model.BrewingDetails;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView ;
    private BrewingAdapter brewingAdapter;
    private ArrayList<BrewingDetails> brewingDetailsArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        BrewingServiceGenerator.getService().getPBrewingDetails().enqueue(new Callback<ArrayList<BrewingDetails>>() {
            @Override
            public void onResponse(Call<ArrayList<BrewingDetails>> call, Response<ArrayList<BrewingDetails>> response) {
                brewingDetailsArrayList =response.body();
                brewingAdapter = new BrewingAdapter(brewingDetailsArrayList);
                Log.e( "onResponse: ", "brewingAdapter");
                recyclerView.setAdapter(brewingAdapter);

            }

            @Override
            public void onFailure(Call<ArrayList<BrewingDetails>> call, Throwable t) {
                Log.e( "onFailure: ", "onFailure");

            }
        });

    }
}
