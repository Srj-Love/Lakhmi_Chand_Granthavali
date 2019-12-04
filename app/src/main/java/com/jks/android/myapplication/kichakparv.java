package com.jks.android.myapplication;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;


public class kichakparv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kichakparv);

        final Button button1 = (Button) findViewById(R.id.kpk);
        final Button button2 = (Button) findViewById(R.id.kp1);
        final Button button3 = (Button) findViewById(R.id.kp2);
        final Button button4 = (Button) findViewById(R.id.kp3);
        final Button button5 = (Button) findViewById(R.id.kp4);
        final Button button6 = (Button) findViewById(R.id.kp5);
        final Button button7 = (Button) findViewById(R.id.kp6);
        final Button button8 = (Button) findViewById(R.id.kp7);
        final Button button9 = (Button) findViewById(R.id.kp8);
        final Button button10 = (Button) findViewById(R.id.kp9);
        final Button button11 = (Button) findViewById(R.id.kp10);
        final Button button12 = (Button) findViewById(R.id.kp11);
        final Button button13 = (Button) findViewById(R.id.kp12);
        final Button button14 = (Button) findViewById(R.id.kp13);
        final Button button15 = (Button) findViewById(R.id.kp14);
        final Button button16 = (Button) findViewById(R.id.kp15);
        final Button button17 = (Button) findViewById(R.id.kp16);
        final Button button18 = (Button) findViewById(R.id.kp17);
        final Button button19 = (Button) findViewById(R.id.kp18);
        final Button button20 = (Button) findViewById(R.id.kp19);
        final Button button21 = (Button) findViewById(R.id.kp20);
        final Button button22 = (Button) findViewById(R.id.kp21);
        final Button button23 = (Button) findViewById(R.id.kp22);
        final Button button24 = (Button) findViewById(R.id.kp23);
        final Button button25 = (Button) findViewById(R.id.kp24);
        final Button button26 = (Button) findViewById(R.id.kp25);
        final Button button27 = (Button) findViewById(R.id.kp26);
        final Button button28 = (Button) findViewById(R.id.kp27);
        final Button button29 = (Button) findViewById(R.id.kp28);
        final Button button30 = (Button) findViewById(R.id.kp29);
        final Button button31 = (Button) findViewById(R.id.kp30);
        final Button button32 = (Button) findViewById(R.id.kp31);
        final Button button33 = (Button) findViewById(R.id.kp32);
        final Button button34 = (Button) findViewById(R.id.kp33);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kpk");
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp1");
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp2");
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp3");
                startActivity(intent);
            }
        });


        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp4");
                startActivity(intent);
            }
        });


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp5");
                startActivity(intent);
            }
        });


        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp6");
                startActivity(intent);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp7");
                startActivity(intent);
            }
        });


        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp8");
                startActivity(intent);
            }
        });


        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp9");
                startActivity(intent);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp10");
                startActivity(intent);
            }
        });


        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp11");
                startActivity(intent);
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp12");
                startActivity(intent);
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp13");
                startActivity(intent);
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp14");
                startActivity(intent);
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp15");
                startActivity(intent);
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp16");
                startActivity(intent);
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp17");
                startActivity(intent);
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp18");
                startActivity(intent);
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp19");
                startActivity(intent);
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp20");
                startActivity(intent);
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp21");
                startActivity(intent);
            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp22");
                startActivity(intent);
            }
        });

        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp23");
                startActivity(intent);
            }
        });

        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp24");
                startActivity(intent);
            }
        });

        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp25");
                startActivity(intent);
            }
        });

        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp26");
                startActivity(intent);
            }
        });

        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp27");
                startActivity(intent);
            }
        });

        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp28");
                startActivity(intent);
            }
        });

        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp29");
                startActivity(intent);
            }
        });

        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp30");
                startActivity(intent);
            }
        });
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp31");
                startActivity(intent);
            }
        });
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp32");
                startActivity(intent);
            }
        });
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kichakparv.this, Data.class).putExtra("id", "kp33");
                startActivity(intent);
            }
        });

    }
}
