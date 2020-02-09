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

    public void aboutMessage(View view)
    {
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
    }

    public void joinMessage(View view)
    {
        Intent intent = new Intent(this, JoinForm.class);
        startActivity(intent);
    }

    public void officersMessage(View view)
    {
        Intent intent = new Intent(this, Officers.class);
        startActivity(intent);
    }

    public void socialMediaMessage(View view)
    {
        Intent intent = new Intent(this, SocialMediaLinks.class);
        startActivity(intent);
    }

    public void currentEventsMessage(View view)
    {
        Intent intent = new Intent(this, CurrentEvents.class);
        startActivity(intent);
    }

    public void signUpMessage(View view)
    {
        Intent intent = new Intent(this, CurrentEventForm.class);
        startActivity(intent);
    }

    public void attendanceMessage(View view)
    {
        Intent intent = new Intent(this, Attendance.class);
        startActivity(intent);
    }

    public void faqMessage(View view)
    {
        Intent intent = new Intent(this, FrequentlyAskedQuestions.class);
        startActivity(intent);
    }

    public void tocMessage(View view) {
        Intent intent = new Intent(this, TermsAndConditions.class);
        startActivity(intent);
    }

    public void submitNow(View view) {
        EditText editText = findViewById(R.id.userNameBox);
        EditText editText1 = findViewById(R.id.messageBox);
        editText.setText("");
        editText1.setText("");
        Toast.makeText(this, "Thanks For Submitting", Toast.LENGTH_SHORT).show();
    }

    public void urlFBLA(View view) {
        Uri uri = Uri.parse("https://jchsfbla.org");
        Intent browser = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(browser);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("FBLA of JCHS");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }



}

