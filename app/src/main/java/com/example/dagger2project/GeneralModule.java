package com.example.dagger2project;

import dagger.Module;
import dagger.Provides;

// Second step

@Module
public class GeneralModule {


    @Provides
    public Time getTime(){
        return new Time();
    }


}
