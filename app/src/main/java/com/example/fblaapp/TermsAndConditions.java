package com.example.fblaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class TermsAndConditions extends AppCompatActivity {

    /**
     * opens social media links from menu bar
     * @param item the menu item selected
     * @return true when the activity opens
     */
    public boolean socialMediaLinks(MenuItem item) {
        Intent intent = new Intent(this, SocialMediaLinks.class);
        startActivity(intent);
        return true;
    }

    /**
     * opens home page from menu bar
     * @param item the menu item selected
     * @return true when the activity opens
     */
    public boolean homePage(MenuItem item) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        return true;
    }

    /**
     * opens officers page from menu bar
     * @param item the menu item selected
     * @return true when the activity opens
     */
    public boolean officerPage(MenuItem item) {
        Intent intent = new Intent(this, Officers.class);
        startActivity(intent);
        return true;
    }

    /**
     * opens about us page from menu bar
     * @param item the menu item selected
     * @return true when the activity opens
     */
    public boolean aboutUs(MenuItem item) {
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
        return true;
    }

    /**
     * opens attendance page from menu bar
     * @param item the menu item selected
     * @return true when the activity opens
     */
    public boolean attendancePage(MenuItem item) {
        Intent intent = new Intent(this, Attendance.class);
        startActivity(intent);
        return true;
    }

    /**
     * opens current events page from menu bar
     * @param item the menu item selected
     * @return true when the activity opens
     */
    public boolean currentEventsPage(MenuItem item) {
        Intent intent = new Intent(this, CurrentEvents.class);
        startActivity(intent);
        return true;
    }

    /**
     * opens the join FBLA from menu bar
     * @param item the menu item selected
     * @return true when the activity opens
     */
    public boolean joinFormPage(MenuItem item) {
        Intent intent = new Intent(this, JoinForm.class);
        startActivity(intent);
        return true;
    }

    /**
     * opens the form to signup for current events from menu bar
     * @param item the menu item selected
     * @return true when the activity opens
     */
    public boolean currentEventSignupPage(MenuItem item) {
        Intent intent = new Intent(this, CurrentEventForm.class);
        startActivity(intent);
        return true;
    }

    /**
     * opens the FAQ from menu bar
     * @param item the menu item selected
     * @return true when the activity opens
     */
    public boolean freqentlyAskedQuestionsPage(MenuItem item) {
        Intent intent = new Intent(this, FrequentlyAskedQuestions.class);
        startActivity(intent);
        return true;
    }

    /**
     * creates and allows the menu bar to open
     * @param menu the menu that you want to open
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    /**
     * code executes when activity is opened
     * @param savedInstanceState previous saved state of the activity
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_conditions);
    }
}
