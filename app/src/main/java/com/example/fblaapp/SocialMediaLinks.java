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

    public void twitter(View view) {
        goUrl("https://twitter.com/jchsfbla?lang=en/");
    }

    private void goUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent browser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(browser);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_media_links);

    }

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
