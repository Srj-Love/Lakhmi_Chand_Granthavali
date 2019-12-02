package com.jks.android.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.waynell.library.DropAnimationView;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1 = findViewById(R.id.Button1);
        Button button2 = findViewById(R.id.Button2);
        Button button4 = findViewById(R.id.Button4);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, kavip.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, saang.class);
            startActivity(intent);
        });

        button4.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, contectus.class);
            startActivity(intent);
        });

        TextView textView = findViewById(R.id.textView);
        textView.setSelected(true);


    }


}
