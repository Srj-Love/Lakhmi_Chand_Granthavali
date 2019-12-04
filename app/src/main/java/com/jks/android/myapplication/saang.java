package com.jks.android.myapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.Toast;

import com.jks.android.myapplication.adapter.SongAdapter;
import com.jks.android.myapplication.model.SongModel;

import java.util.ArrayList;

public class saang extends AppCompatActivity implements SongAdapter.SongClickListener {

    SongAdapter mAdapter;
    ArrayList<SongModel> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saang);

        if (getSupportActionBar() != null) getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        RecyclerView recyclerView = findViewById(R.id.rcv_song);

        mAdapter = new SongAdapter(getData(), saang.this, this);


        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(saang.this));
        recyclerView.addItemDecoration(new DividerItemDecoration(saang.this, DividerItemDecoration.HORIZONTAL));
        recyclerView.setAdapter(mAdapter);


    }

    private ArrayList<SongModel> getData() {

        if (mList != null && mList.size() > 0) mList.clear();

        mList = new ArrayList<>(15);

        mList.add(new SongModel("1— सत्यवान सावित्री", "sataywan"));
        mList.add(new SongModel("2— पूर्णमल", "puranmal"));
        mList.add(new SongModel("3— नल—दमयन्ती", "Naldamyanti"));
        mList.add(new SongModel("4— राजा—हरिश्चन्द्र", "RajaHarishchander"));
        mList.add(new SongModel("5— चापसिंह", "Chapsingh"));
        mList.add(new SongModel("6— सेठ- ताराचंद", "SethTarachand"));
        mList.add(new SongModel("7—चन्द्रगुप्त  धर्ममालकी ", "chnder"));
        mList.add(new SongModel("8— शाही — लकडहारा", "sahilakadhara"));
        mList.add(new SongModel("9— मीरा बाई", "meerabai"));
        mList.add(new SongModel("10— महाभारत (चीर पर्व)", "chirparv"));
        mList.add(new SongModel("11— कीचक पर्व", "kichakparv"));
        mList.add(new SongModel("12— नौटंकी", "notanki"));
        mList.add(new SongModel("13— पदमावत ", "padmavat"));
        mList.add(new SongModel("14— चन्दकिरण", "chandkiran"));
        mList.add(new SongModel("15— ज्यानी चोर", "jaynichor"));
        mList.add(new SongModel("16— हीर रांझा", "heerranja"));
        mList.add(new SongModel("17— उपदेशक भजन", "updashek"));

        return mList;
    }

    @Override
    public void onClick(int pos) {

        try {
            Intent mIntent = new Intent(saang.this, Class.forName(getPackageName() + "." + mList.get(pos).getClassname()));
            startActivity(mIntent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            Toast.makeText(this, "क्षमा करें, डेटा प्राप्त करने में असमर्थ", Toast.LENGTH_SHORT).show();
        }


    }
}
