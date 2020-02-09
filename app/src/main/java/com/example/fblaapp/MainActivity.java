package com.example.fblaapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
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
     * Opens the about us page using buttons
     * @param view the view that utilizes the function
     */
    public void aboutMessage(View view)
    {
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
    }

    /**
     * Opens the join us form using buttons
     * @param view the view that utilizes the function
     */
    public void joinMessage(View view)
    {
        Intent intent = new Intent(this, JoinForm.class);
        startActivity(intent);
    }

    /**
     * Opens the officers page using buttons
     * @param view the view that utilizes the function
     */
    public void officersMessage(View view)
    {
        Intent intent = new Intent(this, Officers.class);
        startActivity(intent);
    }

    /**
     * Opens the social media links page using buttons
     * @param view the view that utilizes the function
     */
    public void socialMediaMessage(View view)
    {
        Intent intent = new Intent(this, SocialMediaLinks.class);
        startActivity(intent);
    }

    /**
     * Opens the current events page using buttons
     * @param view the view that utilizes the function
     */
    public void currentEventsMessage(View view)
    {
        Intent intent = new Intent(this, CurrentEvents.class);
        startActivity(intent);
    }

    /**
     * Opens the current event sign up page using buttons
     * @param view the view that utilizes the function
     */
    public void signUpMessage(View view)
    {
        Intent intent = new Intent(this, CurrentEventForm.class);
        startActivity(intent);
    }

    /**
     * Opens the attendance page using buttons
     * @param view the view that utilizes the function
     */
    public void attendanceMessage(View view)
    {
        Intent intent = new Intent(this, Attendance.class);
        startActivity(intent);
    }

    /**
     * Opens the FAQ page using buttons
     * @param view the view that utilizes the function
     */
    public void faqMessage(View view)
    {
        Intent intent = new Intent(this, FrequentlyAskedQuestions.class);
        startActivity(intent);
    }

    /**
     * Opens the terms and conditions page using buttons
     * @param view the view that utilizes the function
     */
    public void tocMessage(View view) {
        Intent intent = new Intent(this, TermsAndConditions.class);
        startActivity(intent);
    }

    /**
     * opens fbla website using a button
     * @param view the view that utilizes the function
     */
    public void pdfMessage(View view) {
        Uri uri = Uri.parse("https://www.fbla-pbl.org/media/FBLA-EVENTS-AT-A-GLANCE-2019.pdf");
        Intent browser = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(browser);
    }

    /**
     * code executes when form is submitted
     * @param view the view that utilizes the function
     */
    public void submitNow(View view) {
        EditText editText = findViewById(R.id.userNameBox);
        EditText editText1 = findViewById(R.id.messageBox);
        editText.setText("");
        editText1.setText("");
        Toast.makeText(this, "Thanks For Submitting", Toast.LENGTH_SHORT).show();
    }

    /**
     * opens fbla website using a button
     * @param view the view that utilizes the function
     */
    public void urlFBLA(View view) {
        Uri uri = Uri.parse("https://jchsfbla.org");
        Intent browser = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(browser);
    }

    /**
     * code executes when activity is opened
     * @param savedInstanceState previous saved state of the activity
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("FBLA of JCHS");
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



}

