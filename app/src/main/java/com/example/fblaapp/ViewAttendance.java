package com.example.fblaapp;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class ViewAttendance extends AppCompatActivity {

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
     * Code executes when activity is opened. It displays all the attendance results
     * @param savedInstanceState previous saved state of the activity
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_attendance);

        Cursor res = AddAttendance.myDb.getAllData();
        if(res.getCount() == 0) {
            showError("Error", "Sorry there is Nothing found");
        }

        StringBuffer buffer = new StringBuffer();
        while (res.moveToNext()) {
            buffer.append("Name: "+res.getString(0)+"\n");
            buffer.append("Attendance: "+res.getString(1)+"\n\n");
        }

        TextView results = (TextView) findViewById(R.id.resultsAttendance);
        String resText = buffer.toString();
        results.setText(resText);

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
     * Shows an error alert if there is no data to show
     * @param title The Title of the message
     * @param message The message itself
     */
    public void showError(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
}
