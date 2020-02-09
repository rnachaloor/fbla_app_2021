package com.example.fblaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class EventFormSubmitted extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_form_submitted);
    }

    public void homePage(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
