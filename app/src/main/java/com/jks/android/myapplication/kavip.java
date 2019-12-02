package com.jks.android.myapplication;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class kavip extends AppCompatActivity {


    SwipeRefreshLayout swipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kavip);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        swipe = (SwipeRefreshLayout) findViewById(R.id.swipe);
        swipe.setColorSchemeColors(getResources()
                .getColor(android.R.color.holo_orange_dark), getResources()
                .getColor(android.R.color.holo_blue_dark), getResources()
                .getColor(android.R.color.holo_green_dark));

        swipe.setOnRefreshListener(this::LoadWeb);

        LoadWeb();


    }

    public void LoadWeb() {

        String myurl = getString(R.string.main_url);

        WebView view = findViewById(R.id.webView);
        view.setWebViewClient(new AppClient());

        swipe.setRefreshing(true);


        // Javascript inabled on webview
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(myurl);

    }

    private class AppClient extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return super.shouldOverrideUrlLoading(view, request);
        }


        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            swipe.setRefreshing(true);
        }


        @Override
        public void onPageFinished(WebView view, String url) {
            swipe.setRefreshing(false);
            super.onPageFinished(view, url);
            // swipe.setRefreshing(false);
        }
    }
}
