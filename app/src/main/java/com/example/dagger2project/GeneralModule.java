package com.example.dagger2project;

import android.content.Context;
import android.content.SharedPreferences;

import dagger.Module;
import dagger.Provides;

// Second step

@Module
public class GeneralModule {

    private Context context;

    public GeneralModule(Context context) {
        this.context = context;
    }


    @Provides
    public Time getTime() {
        return new Time();
    }



    @Provides
    SharedPreferences provideSharedPreferences() {
        return context.getSharedPreferences("PrefName",Context.MODE_PRIVATE);
    }



}
