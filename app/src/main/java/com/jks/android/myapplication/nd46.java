package com.jks.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class nd46 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nd46);
        String myurl="file:///android_asset/nd46.html";
        WebView view = (WebView) findViewById(R.id.webView);


        // Javascript inabled on webview
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(myurl);
        view.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return true;
            }
        });
        view.setLongClickable(false);   }
}