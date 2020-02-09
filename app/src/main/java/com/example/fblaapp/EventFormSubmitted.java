package com.example.fblaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class EventFormSubmitted extends AppCompatActivity {
    /**
     * code executes when activity is opened
     * @param savedInstanceState previous saved state of the activity
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_form_submitted);
    }

    /**
     * opens home page using the button
     * @param view the view that utilizes the function
     */
    public void homePage(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
