package com.example.dagger2project;

import android.content.SharedPreferences;

import javax.inject.Inject;

public class MySharedPreferences {

    private SharedPreferences mSharedPreferences;

    @Inject
    public MySharedPreferences(SharedPreferences mSharedPreferences) {
        this.mSharedPreferences = mSharedPreferences;
    }

    public void saveString(String key, String data) {
        mSharedPreferences.edit().putString(key,data).apply();
    }

    public String getString(String key) {
        return mSharedPreferences.getString(key,"");
    }

    public void saveInt(String key, int data) {
        mSharedPreferences.edit().putInt(key,data).apply();
    }

    public Integer getInt(String key) {
        return mSharedPreferences.getInt(key,0);
    }
}
