package com.jks.android.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class sataywan extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sataywan);

        Button button1 = (Button) findViewById(R.id.ss1);
        Button button2 = (Button) findViewById(R.id.ss2);
        Button button3 = (Button) findViewById(R.id.ss3);
        Button button4 = (Button) findViewById(R.id.ss4);
        Button button5 = (Button) findViewById(R.id.ss5);
        Button button6 = (Button) findViewById(R.id.ss6);
        Button button7 = (Button) findViewById(R.id.ss7);
        Button button8 = (Button) findViewById(R.id.ss8);
        Button button9 = (Button) findViewById(R.id.ss9);
        Button button10 = (Button) findViewById(R.id.ss10);
        Button button11 = (Button) findViewById(R.id.ss11);
        Button button12 = (Button) findViewById(R.id.ss12);
        Button button13 = (Button) findViewById(R.id.ss13);
        Button button14 = (Button) findViewById(R.id.ss14);
        Button button15 = (Button) findViewById(R.id.ss15);
        Button button16 = (Button) findViewById(R.id.ss16);
        Button button17 = (Button) findViewById(R.id.ss17);
        Button button18 = (Button) findViewById(R.id.ss18);
        Button button19 = (Button) findViewById(R.id.ss19);
        Button button20 = (Button) findViewById(R.id.ss20);
        Button button21 = (Button) findViewById(R.id.ss21);
        Button button22 = (Button) findViewById(R.id.ss22);
        Button button23 = (Button) findViewById(R.id.ss23);
        Button button24 = (Button) findViewById(R.id.ss24);
        Button button25 = (Button) findViewById(R.id.ss25);
        Button button26 = (Button) findViewById(R.id.ss26);
        Button button27 = (Button) findViewById(R.id.ss27);
        Button button28 = (Button) findViewById(R.id.ss28);
        Button button29 = (Button) findViewById(R.id.ss29);
        Button button30 = (Button) findViewById(R.id.ss30);
        Button button31 = (Button) findViewById(R.id.ss31);
        Button button32 = (Button) findViewById(R.id.ss32);
        Button button33 = (Button) findViewById(R.id.ss33);
        Button button34 = (Button) findViewById(R.id.ss34);
        Button button35 = (Button) findViewById(R.id.ss35);
        Button button36 = (Button) findViewById(R.id.ss36);
        Button button37 = (Button) findViewById(R.id.ssk);


        ArrayList<String> mList = new ArrayList<>();
        mList.add(button1.getText().toString());
        mList.add(button2.getText().toString());
        mList.add(button3.getText().toString());
        mList.add(button4.getText().toString());
        mList.add(button5.getText().toString());
        mList.add(button6.getText().toString());
        mList.add(button7.getText().toString());
        mList.add(button8.getText().toString());
        mList.add(button9.getText().toString());
        mList.add(button10.getText().toString());
        mList.add(button11.getText().toString());
        mList.add(button12.getText().toString());
        mList.add(button13.getText().toString());
        mList.add(button14.getText().toString());
        mList.add(button15.getText().toString());
        mList.add(button16.getText().toString());
        mList.add(button17.getText().toString());
        mList.add(button18.getText().toString());
        mList.add(button19.getText().toString());
        mList.add(button20.getText().toString());
        mList.add(button21.getText().toString());
        mList.add(button22.getText().toString());
        mList.add(button23.getText().toString());
        mList.add(button24.getText().toString());
        mList.add(button25.getText().toString());
        mList.add(button26.getText().toString());
        mList.add(button27.getText().toString());
        mList.add(button28.getText().toString());
        mList.add(button29.getText().toString());
        mList.add(button30.getText().toString());
        mList.add(button31.getText().toString());
        mList.add(button32.getText().toString());
        mList.add(button33.getText().toString());
        mList.add(button34.getText().toString());
        mList.add(button35.getText().toString());
        mList.add(button36.getText().toString());
        mList.add(button37.getText().toString());

        for (int i = 0; i < mList.size(); i++) {
            System.out.println(mList.get(i));
        }

        button1.setOnClickListener(v -> {
            Intent intent = new Intent(sataywan.this, ss1.class);
            startActivity(intent);
        });

        button2.setOnClickListener(v -> {
            Intent intent = new Intent(sataywan.this, ss2.class);
            startActivity(intent);
        });

        button3.setOnClickListener(v -> {
            Intent intent = new Intent(sataywan.this, ss3.class);
            startActivity(intent);
        });
        button4.setOnClickListener(v -> {
            Intent intent = new Intent(sataywan.this, ss4.class);
            startActivity(intent);
        });

        button5.setOnClickListener(v -> {
            Intent intent = new Intent(sataywan.this, ss5.class);
            startActivity(intent);
        });

        button6.setOnClickListener(v -> {
            Intent intent = new Intent(sataywan.this, ss6.class);
            startActivity(intent);
        });

        button7.setOnClickListener(v -> {
            Intent intent = new Intent(sataywan.this, ss7.class);
            startActivity(intent);
        });

        button8.setOnClickListener(v -> {
            Intent intent = new Intent(sataywan.this, ss8.class);
            startActivity(intent);
        });

        button9.setOnClickListener(v -> {
            Intent intent = new Intent(sataywan.this, ss9.class);
            startActivity(intent);
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sataywan.this, ss10.class);
                startActivity(intent);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sataywan.this, ss11.class);
                startActivity(intent);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sataywan.this, ss12.class);
                startActivity(intent);
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sataywan.this, ss13.class);
                startActivity(intent);
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sataywan.this, ss14.class);
                startActivity(intent);
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sataywan.this, ss15.class);
                startActivity(intent);
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sataywan.this, ss16.class);
                startActivity(intent);
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sataywan.this, ss17.class);
                startActivity(intent);
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sataywan.this, ss18.class);
                startActivity(intent);
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sataywan.this, ss19.class);
                startActivity(intent);
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sataywan.this, ss20.class);
                startActivity(intent);
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sataywan.this, ss21.class);
                startActivity(intent);
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sataywan.this, ss22.class);
                startActivity(intent);
            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sataywan.this, ss23.class);
                startActivity(intent);
            }
        });

        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sataywan.this, ss24.class);
                startActivity(intent);
            }
        });

        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sataywan.this, ss25.class);
                startActivity(intent);
            }
        });

        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sataywan.this, ss26.class);
                startActivity(intent);
            }
        });

        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sataywan.this, ss27.class);
                startActivity(intent);
            }
        });

        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sataywan.this, ss28.class);
                startActivity(intent);
            }
        });

        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sataywan.this, ss29.class);
                startActivity(intent);
            }
        });

        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sataywan.this, ss30.class);
                startActivity(intent);
            }
        });

        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sataywan.this, ss31.class);
                startActivity(intent);
            }
        });

        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sataywan.this, ss32.class);
                startActivity(intent);
            }
        });

        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sataywan.this, ss33.class);
                startActivity(intent);
            }
        });

        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sataywan.this, ss34.class);
                startActivity(intent);
            }
        });

        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sataywan.this, ss35.class);
                startActivity(intent);
            }
        });

        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sataywan.this, ss36.class);
                startActivity(intent);
            }
        });

        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sataywan.this, ssk.class);
                startActivity(intent);
            }
        });


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


}

