package com.example.traveljournal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.traveljournal.DrawerJournal.NavigationDrawerActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Redirect to the main activity
        startActivity(new Intent(this,
                NavigationDrawerActivity.class));

        finish(); // we use this so the user cannot go back to splashscreen
    }
}