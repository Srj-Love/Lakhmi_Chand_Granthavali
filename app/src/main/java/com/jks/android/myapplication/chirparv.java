package com.jks.android.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

public class chirparv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chirparv);
        final Button button1 = (Button) findViewById(R.id.cpk);
        final Button button2 = (Button) findViewById(R.id.cp1);
        final Button button3 = (Button) findViewById(R.id.cp2);
        final Button button4 = (Button) findViewById(R.id.cp3);
        final Button button5 = (Button) findViewById(R.id.cp4);
        final Button button6 = (Button) findViewById(R.id.cp5);
        final Button button7 = (Button) findViewById(R.id.cp6);
        final Button button8 = (Button) findViewById(R.id.cp7);
        final Button button9 = (Button) findViewById(R.id.cp8);
        final Button button10 = (Button) findViewById(R.id.cp9);
        final Button button11 = (Button) findViewById(R.id.cp10);
        final Button button12 = (Button) findViewById(R.id.cp11);
        final Button button13 = (Button) findViewById(R.id.cp12);
        final Button button14 = (Button) findViewById(R.id.cp13);
        final Button button15 = (Button) findViewById(R.id.cp14);
        final Button button16 = (Button) findViewById(R.id.cp15);
        final Button button17 = (Button) findViewById(R.id.cp16);
        final Button button18 = (Button) findViewById(R.id.cp17);
        final Button button19 = (Button) findViewById(R.id.cp18);
        final Button button20 = (Button) findViewById(R.id.cp19);
        final Button button21 = (Button) findViewById(R.id.cp20);
        final Button button22 = (Button) findViewById(R.id.cp21);
        final Button button23 = (Button) findViewById(R.id.cp22);
        final Button button24 = (Button) findViewById(R.id.cp23);
        final Button button25 = (Button) findViewById(R.id.cp24);
        final Button button26 = (Button) findViewById(R.id.cp25);
        final Button button27 = (Button) findViewById(R.id.cp26);
        final Button button28 = (Button) findViewById(R.id.cp27);
        final Button button29 = (Button) findViewById(R.id.cp28);
        final Button button30 = (Button) findViewById(R.id.cp29);
        final Button button31 = (Button) findViewById(R.id.cp30);
        final Button button32 = (Button) findViewById(R.id.cp31);
        final Button button33 = (Button) findViewById(R.id.cp32);
        final Button button34 = (Button) findViewById(R.id.cp33);
        final Button button35 = (Button) findViewById(R.id.cp34);
        final Button button36 = (Button) findViewById(R.id.cp35);
        final Button button37 = (Button) findViewById(R.id.cp36);
        final Button button38 = (Button) findViewById(R.id.cp37);
        final Button button39 = (Button) findViewById(R.id.cp38);
        final Button button40 = (Button) findViewById(R.id.cp39);
        final Button button41 = (Button) findViewById(R.id.cp40);





        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cpk");
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp1");
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp2");
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp3");
                startActivity(intent);
            }
        });


        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp4");
                startActivity(intent);
            }
        });


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp5");
                startActivity(intent);
            }
        });


        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp6");
                startActivity(intent);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp7");
                startActivity(intent);
            }
        });


        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp8");
                startActivity(intent);
            }
        });


        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp9");
                startActivity(intent);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp10");
                        startActivity(intent);
                    }
                });


        button12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp11");
                        startActivity(intent);
                    }
                });

        button13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp12");
                        startActivity(intent);
                    }
                });

        button14.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp13");
                        startActivity(intent);
                    }
                });

        button15.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp14");
                        startActivity(intent);
                    }
                });

        button16.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp15");
                        startActivity(intent);
                    }
                });

        button17.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp16");
                        startActivity(intent);
                    }
                });

        button18.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp17");
                        startActivity(intent);
                    }
                });

        button19.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp18");
                        startActivity(intent);
                    }
                });

        button20.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp19");
                        startActivity(intent);
                    }
                });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp20");
                startActivity(intent);
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp21");
                startActivity(intent);
            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp22");
                startActivity(intent);
            }
        });

        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp23");
                startActivity(intent);
            }
        });

        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp24");
                startActivity(intent);
            }
        });

        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp25");
                startActivity(intent);
            }
        });

        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp26");
                startActivity(intent);
            }
        });

        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp27");
                startActivity(intent);
            }
        });

        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp28");
                startActivity(intent);
            }
        });

        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp29");
                startActivity(intent);
            }
        });

        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp30");
                startActivity(intent);
            }
        });
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp31");
                startActivity(intent);
            }
        });
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp32");
                startActivity(intent);
            }
        });
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp33");
                startActivity(intent);
            }
        });
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp34");
                startActivity(intent);
            }
        });
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp35");
                startActivity(intent);
            }
        });
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp36");
                startActivity(intent);
            }
        });
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp37");
                startActivity(intent);
            }
        });
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp38");
                startActivity(intent);
            }
        });
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp39");
                startActivity(intent);
            }
        });
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chirparv.this, Data.class).putExtra("id", "cp40");
                startActivity(intent);
            }
        });














    }
}
