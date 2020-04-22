package com.brewing_companies.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BrewingServiceGenerator {
    private static BrewingApi SERVICE;

    private static void initialize() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.openbrewerydb.org/")
                .addConverterFactory(GsonConverterFactory.create()).build();

        SERVICE = retrofit.create(BrewingApi.class);
    }

    public static BrewingApi getService() {
        if (SERVICE == null) {
            initialize();
        }
        return SERVICE;
    }
}
