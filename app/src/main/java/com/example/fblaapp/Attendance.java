package com.example.fblaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Attendance extends AppCompatActivity {

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
     * code executes when activity is opened
     * @param savedInstanceState previous saved instance of a database
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);
    }

    /**
     * Places and allows for the opening of the menu bar
     * @param menu the menu that is being opened
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }


    /**
     * Opens the attendance tracking form using the text button
     * @param view view that utilizes the function
     * @return
     */
    public boolean addData(View view) {
        Intent intent = new Intent(this, AddAttendance.class);
        startActivity(intent);
        return true;
    }

    /**
     * Opens the attendance data using the text button
     * @param view view that utilizes the function
     * @return
     */
    public boolean viewData(View view) {
        Intent intent = new Intent(this, ViewAttendance.class);
        startActivity(intent);
        return true;
    }
}
