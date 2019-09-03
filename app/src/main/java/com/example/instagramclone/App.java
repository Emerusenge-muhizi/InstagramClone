package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {

        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("u1cvhUVbhdWiq0bqe9ojbcZATGYbzuvlVV6YeJtO")
                // if defined
                .clientKey("o9lOV7cKs9EPIXIwbmSd6HP7jPv7hJHVhPs4E8ki")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
