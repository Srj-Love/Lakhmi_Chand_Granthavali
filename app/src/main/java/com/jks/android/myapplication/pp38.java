package com.jks.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class pp38 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pp38);
        String myurl="file:///android_asset/P38.html";
        WebView view = (WebView) findViewById(R.id.webView);


        // Javascript inabled on webview
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(myurl);
    }
}