package com.example.fblaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddAttendance extends AppCompatActivity {

    public static DatabaseHelper myDb;

    public boolean socialMediaLinks(MenuItem item) {
        Intent intent = new Intent(this, SocialMediaLinks.class);
        startActivity(intent);
        return true;
    }

    public boolean homePage(MenuItem item) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        return true;
    }

    public boolean officerPage(MenuItem item) {
        Intent intent = new Intent(this, Officers.class);
        startActivity(intent);
        return true;
    }

    public boolean aboutUs(MenuItem item) {
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
        return true;
    }

    public boolean attendancePage(MenuItem item) {
        Intent intent = new Intent(this, Attendance.class);
        startActivity(intent);
        return true;
    }

    public boolean currentEventsPage(MenuItem item) {
        Intent intent = new Intent(this, CurrentEvents.class);
        startActivity(intent);
        return true;
    }

    public boolean joinFormPage(MenuItem item) {
        Intent intent = new Intent(this, JoinForm.class);
        startActivity(intent);
        return true;
    }

    public boolean freqentlyAskedQuestionsPage(MenuItem item) {
        Intent intent = new Intent(this, FrequentlyAskedQuestions.class);
        startActivity(intent);
        return true;
    }

    public boolean currentEventSignupPage(MenuItem item) {
        Intent intent = new Intent(this, CurrentEventForm.class);
        startActivity(intent);
        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_attendance);
        myDb = new DatabaseHelper(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    public void submit(View view) {
        EditText name = (EditText) findViewById(R.id.eventNameBox);
        EditText attend = (EditText) findViewById(R.id.attendanceAmount);
        boolean isInserted = myDb.insertData(name.getText().toString(), attend.getText().toString());
        if(isInserted) {
            Toast.makeText(AddAttendance.this, "Data Inserted", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(AddAttendance.this, "Data Not Inserted", Toast.LENGTH_LONG).show();
        }

    }

    public void view(View view) {
        Intent intent = new Intent(this, ViewAttendance.class);
        startActivity(intent);
    }
}
