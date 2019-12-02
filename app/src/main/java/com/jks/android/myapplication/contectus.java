package com.jks.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class contectus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contectus);

        TextView email = (TextView) findViewById(R.id.textViewEmail);
        email.setText(Html.fromHtml("<a href=\"mailto:pk.jks77@gmail.com\"> Email: pk.jks77@gmail.com</a>"));
        email.setMovementMethod(LinkMovementMethod.getInstance());



    }
}
