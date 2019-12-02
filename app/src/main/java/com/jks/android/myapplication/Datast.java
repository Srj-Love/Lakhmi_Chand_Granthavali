package com.jks.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;

public class Datast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datast);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        switch (getIntent().getStringExtra("id")) {
            case "stk":
                setTitle("कथासार :—");
                break;






            default:
                setTitle("पंडित लख्मीचंद ग्रंथावाली");
    }
        WebView webView = findViewById(R.id.webView);


        webView.loadUrl("file:///android_asset/" + getIntent().getStringExtra("id") + ".html");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);


    }
}
