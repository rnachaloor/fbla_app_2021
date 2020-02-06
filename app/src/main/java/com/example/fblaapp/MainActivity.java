package com.example.fblaapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //handles which item you select
        switch (item.getItemId()) {
            case R.id.home:
                System.out.println("Filler Function");
                return true;
            case R.id.aboutUs:
                System.out.println("Fill Function");
                return true;
            case R.id.joinButton:
                System.out.println("Filler Func");
                return true;
            case R.id.officers:
                System.out.println("Fill Func");
                return true;
            case R.id.social:
                System.out.println("Filler Text");
                return true;
            case R.id.currentEvent:
                System.out.println("Fill Text");
                return true;
            case R.id.eventSignup:
                System.out.println("Text Fill");
                return true;
            default:
                System.out.println("Placeholder");
                return true;
        }
    }
}

