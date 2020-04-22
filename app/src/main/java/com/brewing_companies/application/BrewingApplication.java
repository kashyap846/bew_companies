package com.brewing_companies.application;

import android.app.Application;
import android.content.Context;

public class BrewingApplication extends Application {
    private static Context application;

    @Override
    public void onCreate() {
        super.onCreate();
        application = getApplicationContext();
    }

    public static Context getContext() {
        return application;
    }

}
