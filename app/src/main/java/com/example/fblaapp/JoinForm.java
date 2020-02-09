package com.example.fblaapp;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class JoinForm extends AppCompatActivity {

    public String userName = "";
    public String gradClass = "";
    public String shirtSize = "";

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
        Intent intent = new Intent(this, Paint.Join.class);
        startActivity(intent);
        return true;
    }

    public void joinFormSubmit(View view) {
        final EditText nameBox = (EditText) findViewById(R.id.userNameBox);
        userName = nameBox.toString();
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.freshmenOption:
                if (checked) {
                    gradClass = "Freshmen";
                }
                break;
            case R.id.sophomoreOption:
                if (checked) {
                    gradClass = "Sophomore";
                }
                break;
            case R.id.juniorOption:
                if (checked) {
                    gradClass = "Junior";
                }
                break;
            case R.id.seniorOption:
                if (checked) {
                    gradClass = "Senior";
                }
                break;
            case R.id.shirtSmall:
                if (checked) {
                    shirtSize = "Small";
                }
                break;
            case R.id.shirtMedium:
                if (checked) {
                    shirtSize = "Medium";
                }
                break;
            case R.id.shirtLarge:
                if (checked) {
                    shirtSize = "Large";
                }
                break;
            case R.id.shirtExtraLarge:
                if (checked) {
                    shirtSize = "Extra Large";
                }
                break;

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_form);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }
}
