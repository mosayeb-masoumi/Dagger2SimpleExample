package com.example.dagger2project;

import android.app.Application;

public class App extends Application {

    // forth step

      GeneralComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerGeneralComponent.builder()
                .generalModule(new GeneralModule(getApplicationContext()))  // add
                .build();

    }

    public GeneralComponent getComponent() {
        return component;
    }
}
