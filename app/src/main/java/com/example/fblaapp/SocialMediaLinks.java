package com.example.fblaapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class SocialMediaLinks extends AppCompatActivity {

    private void urls(String url) {
        Uri uri = Uri.parse(url);
        Intent browser = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(browser);
    }

    public void twitter(View view) {
        urls("https://twitter.com/jchsfbla?lang=en/");
    }

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
     * @param savedInstanceState previous saved state of the activity
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_media_links);

    }

    /**
     * creates and allows the menu bar to open. also opens web view
     * @param menu the menu that you want to open
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        WebView twitterView = (WebView) findViewById(R.id.twitterView);
        WebSettings webSettings = twitterView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        twitterView.setWebViewClient(new WebViewClient());
        twitterView.loadUrl("https://twitter.com/jchsfbla?lang=en/");
        return true;
    }
}
