package com.example.fblaapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class JoinFormFinish extends AppCompatActivity {

    /**
     * Opens urls in browser
     * @param url the url you want to open in the browser
     */
    private void urls(String url) {
        Uri uri = Uri.parse(url);
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
        setContentView(R.layout.activity_join_form_finish);
    }

    /**
     * uses urls function to open the website to pay FBLA duees
     * @param view view that uses the function
     */
    public void duesPayment(View view) {
        urls("https://osp.osmsinc.com/FultonGA/BVModules/ProductTemplates/Bvc2013/Product.aspx?productid=EN713-73");
    }

    /**
     * Opens the home page using button
     * @param view view that uses the function
     */
    public void homePage(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
