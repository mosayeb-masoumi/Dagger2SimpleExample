package com.example.dagger2project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    TextView txt;

    @Inject
    Time time;

    @Inject
    MySharedPreferences mySharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ((App) getApplication()).component.inject(this);

        txt = findViewById(R.id.txt);


        Toast.makeText(this, ""+time.myTime(), Toast.LENGTH_SHORT).show();



        mySharedPreferences.saveInt("key",47);
        int name = mySharedPreferences.getInt("key");
        txt.setText(String.valueOf(name));

    }
}
