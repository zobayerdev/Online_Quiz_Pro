package com.trodev.quizpro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // action bar title
        getSupportActionBar().setTitle("your title");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }
}