package com.jks.android.myapplication;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;


public class notanki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notanki);

        final Button button1 = (Button) findViewById(R.id.ntk);
        final Button button2 = (Button) findViewById(R.id.nt1);
        final Button button3 = (Button) findViewById(R.id.nt2);
        final Button button4 = (Button) findViewById(R.id.nt3);
        final Button button5 = (Button) findViewById(R.id.nt4);
        final Button button6 = (Button) findViewById(R.id.nt5);
        final Button button7 = (Button) findViewById(R.id.nt6);
        final Button button8 = (Button) findViewById(R.id.nt7);
        final Button button9 = (Button) findViewById(R.id.nt8);
        final Button button10 = (Button) findViewById(R.id.nt9);
        final Button button11 = (Button) findViewById(R.id.nt10);
        final Button button12 = (Button) findViewById(R.id.nt11);
        final Button button13 = (Button) findViewById(R.id.nt12);
        final Button button14 = (Button) findViewById(R.id.nt13);
        final Button button15 = (Button) findViewById(R.id.nt14);
        final Button button16 = (Button) findViewById(R.id.nt15);
        final Button button17 = (Button) findViewById(R.id.nt16);
        final Button button18 = (Button) findViewById(R.id.nt17);
        final Button button19 = (Button) findViewById(R.id.nt18);
        final Button button20 = (Button) findViewById(R.id.nt19);
        final Button button21 = (Button) findViewById(R.id.nt20);
        final Button button22 = (Button) findViewById(R.id.nt21);
        final Button button23 = (Button) findViewById(R.id.nt22);
        final Button button24 = (Button) findViewById(R.id.nt23);
        final Button button25 = (Button) findViewById(R.id.nt24);
        final Button button26 = (Button) findViewById(R.id.nt25);
        final Button button27 = (Button) findViewById(R.id.nt26);
        final Button button28 = (Button) findViewById(R.id.nt27);
        final Button button29 = (Button) findViewById(R.id.nt28);
        final Button button30 = (Button) findViewById(R.id.nt29);
        final Button button31 = (Button) findViewById(R.id.nt30);
        final Button button32 = (Button) findViewById(R.id.nt31);
        final Button button33 = (Button) findViewById(R.id.nt32);
        final Button button34 = (Button) findViewById(R.id.nt33);
        final Button button35 = (Button) findViewById(R.id.nt34);
        final Button button36 = (Button) findViewById(R.id.nt35);
        final Button button37 = (Button) findViewById(R.id.nt36);
        final Button button38 = (Button) findViewById(R.id.nt37);
        final Button button39 = (Button) findViewById(R.id.nt38);
        final Button button40 = (Button) findViewById(R.id.nt39);
        final Button button41 = (Button) findViewById(R.id.nt40);
        final Button button42 = (Button) findViewById(R.id.nt41);
        final Button button43 = (Button) findViewById(R.id.nt42);
        final Button button44 = (Button) findViewById(R.id.nt43);
        final Button button45 = (Button) findViewById(R.id.nt44);
        final Button button46 = (Button) findViewById(R.id.nt45);
        final Button button47 = (Button) findViewById(R.id.nt46);
        final Button button48 = (Button) findViewById(R.id.nt47);
        final Button button49 = (Button) findViewById(R.id.nt48);
        final Button button50= (Button) findViewById(R.id.nt49);
        final Button button51 = (Button) findViewById(R.id.nt50);
        final Button button52 = (Button) findViewById(R.id.nt51);
        final Button button53 = (Button) findViewById(R.id.nt52);
        final Button button54 = (Button) findViewById(R.id.nt53);
        final Button button55 = (Button) findViewById(R.id.nt54);
        final Button button56 = (Button) findViewById(R.id.nt55);
        final Button button57 = (Button) findViewById(R.id.nt56);
        final Button button58 = (Button) findViewById(R.id.nt57);
        final Button button59 = (Button) findViewById(R.id.nt58);
        final Button button60 = (Button) findViewById(R.id.nt59);
        final Button button61 = (Button) findViewById(R.id.nt60);
        final Button button62 = (Button) findViewById(R.id.nt61);
        final Button button63 = (Button) findViewById(R.id.nt62);
        final Button button64 = (Button) findViewById(R.id.nt63);
        final Button button65 = (Button) findViewById(R.id.nt64);
        final Button button66 = (Button) findViewById(R.id.nt65);
        final Button button67 = (Button) findViewById(R.id.nt66);
        final Button button68 = (Button) findViewById(R.id.nt67);
        final Button button69 = (Button) findViewById(R.id.nt68);
        final Button button70 = (Button) findViewById(R.id.nt69);







        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "ntk");
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt1");
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt2");
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt3");
                startActivity(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt4");
                startActivity(intent);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt5");
                startActivity(intent);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt6");
                startActivity(intent);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt7");
                startActivity(intent);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt8");
                startActivity(intent);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt9");
                startActivity(intent);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt10");
                startActivity(intent);
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt11");
                startActivity(intent);
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt12");
                startActivity(intent);
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt13");
                startActivity(intent);
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt14");
                startActivity(intent);
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt15");
                startActivity(intent);
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt16");
                startActivity(intent);
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt17");
                startActivity(intent);
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt18");
                startActivity(intent);
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt19");
                startActivity(intent);
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt20");
                startActivity(intent);
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt21");
                startActivity(intent);
            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt22");
                startActivity(intent);

            }
        });
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt23");
                startActivity(intent);
            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt24");
                startActivity(intent);
            }
        });
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt25");
                startActivity(intent);
            }
        });
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt26");
                startActivity(intent);
            }
        });
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt27");
                startActivity(intent);
            }
        });
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt28");
                startActivity(intent);
            }
        });
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt29");
                startActivity(intent);
            }
        });
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt30");
                startActivity(intent);
            }
        });
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt31");
                startActivity(intent);
            }
        });
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt32");
                startActivity(intent);
            }
        });
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt33");
                startActivity(intent);
            }
        });
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt34");
                startActivity(intent);
            }
        });
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt35");
                startActivity(intent);

            }
        });

        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt36");
                startActivity(intent);
            }
        });

        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt37");
                startActivity(intent);
            }
        });
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt38");
                startActivity(intent);
            }
        });
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt39");
                startActivity(intent);
            }
        });
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt40");
                startActivity(intent);
            }
        });

        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt41");
                startActivity(intent);
            }
        });

        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt42");
                startActivity(intent);
            }
        });

        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt43");
                startActivity(intent);
            }
        });

        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt44");
                startActivity(intent);
            }
        });

        button46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt45");
                startActivity(intent);
            }
        });

        button47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt46");
                startActivity(intent);
            }
        });

        button48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt47");
                startActivity(intent);
            }
        });

        button49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt48");
                startActivity(intent);
            }
        });

        button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt49");
                startActivity(intent);
            }
        });

        button51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt50");
                startActivity(intent);
            }
        });

        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt51");
                startActivity(intent);
            }
        });

        button53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt52");
                startActivity(intent);
            }
        });

        button54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt53");
                startActivity(intent);
            }
        });

        button55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt54");
                startActivity(intent);
            }
        });

        button56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt55");
                startActivity(intent);
            }
        });

        button57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt56");
                startActivity(intent);
            }
        });

        button58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt57");
                startActivity(intent);
            }
        });

        button59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt58");
                startActivity(intent);
            }
        });

        button60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt59");
                startActivity(intent);
            }
        });

        button61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt60");
                startActivity(intent);
            }
        });

        button62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt61");
                startActivity(intent);
            }
        });

        button63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt62");
                startActivity(intent);
            }
        });

        button64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt63");
                startActivity(intent);
            }
        });

        button65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt64");
                startActivity(intent);
            }
        });

        button66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt65");
                startActivity(intent);
            }
        });

        button67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt66");
                startActivity(intent);
            }
        });

        button68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt67");
                startActivity(intent);
            }
        });

        button69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt68");
                startActivity(intent);
            }
        });

        button70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notanki.this, Data.class).putExtra("id", "nt69");
                startActivity(intent);
            }
        });







    }
}
