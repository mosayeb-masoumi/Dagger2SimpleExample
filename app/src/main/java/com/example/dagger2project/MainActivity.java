package com.example.dagger2project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    TextView txt;


    // sixth step
    @Inject
    Time time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //  fifth step
        ((App) getApplication()).component.inject(this);


        txt = findViewById(R.id.txt);

        txt.setText(time.myTime());

    }
}
