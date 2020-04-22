package com.brewing_companies.api;

import com.brewing_companies.model.BrewingDetails;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BrewingApi {
    @GET("breweries")
    Call<ArrayList<BrewingDetails>> getPBrewingDetails();
}
