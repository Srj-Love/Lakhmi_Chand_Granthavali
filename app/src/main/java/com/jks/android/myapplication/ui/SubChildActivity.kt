package com.jks.android.myapplication.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.common.reflect.TypeToken
import com.google.firebase.firestore.FirebaseFirestore
import com.google.gson.GsonBuilder
import com.jks.android.myapplication.R
import com.jks.android.myapplication.adapter.SongChildAdapter
import com.jks.android.myapplication.model.JsonDataModel
import com.jks.android.myapplication.utils.Constants
import kotlinx.android.synthetic.main.activity_saang.*

class SubChildActivity : AppCompatActivity(), SongChildAdapter.SongClickListener {

    val TAG = SubChildActivity::class.java.simpleName


    var mAdapter: SongChildAdapter? = null
    var mList: ArrayList<JsonDataModel.Data>? = null
    lateinit var recyclerView: RecyclerView
    lateinit var mdataModel: JsonDataModel.Data

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saang)


        if (supportActionBar != null) supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        if (intent.hasExtra(Constants.SUB_ID) && intent.hasExtra(Constants.EXTRA)) {
            val mStringData = intent.getStringExtra(Constants.EXTRA)

            val groupListType = object : TypeToken<JsonDataModel.Data>() {}.type
            val gson = GsonBuilder().create()
            mdataModel = gson.fromJson(mStringData, groupListType)

        }



        pb.visibility = View.GONE

        recyclerView = findViewById(R.id.rcv_song)
        val db = FirebaseFirestore.getInstance()


        mList = ArrayList()

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this@SubChildActivity)
        recyclerView.addItemDecoration(DividerItemDecoration(this@SubChildActivity, DividerItemDecoration.HORIZONTAL))

        mdataModel?.let {

            mAdapter = SongChildAdapter(it.dataList as java.util.ArrayList<JsonDataModel.DataStoryList>?, this@SubChildActivity, this)
            recyclerView.adapter = mAdapter


        }
        //getQueryData(db)
    }

    private val data: ArrayList<JsonDataModel.Data>
        get() {
            if (mList != null && mList!!.size > 0) mList!!.clear()
            mList = ArrayList()
            /*mList!!.add(SongModel("1— सत्यवान सावित्री", "sataywan"))
            mList!!.add(SongModel("2— पूर्णमल", "puranmal"))
            mList!!.add(SongModel("3— नल—दमयन्ती", "Naldamyanti"))
            mList!!.add(SongModel("4— राजा—हरिश्चन्द्र", "RajaHarishchander"))
            mList!!.add(SongModel("5— चापसिंह", "Chapsingh"))
            mList!!.add(SongModel("6— सेठ- ताराचंद", "SethTarachand"))
            mList!!.add(SongModel("7—चन्द्रगुप्त  धर्ममालकी ", "chnder"))
            mList!!.add(SongModel("8— शाही — लकडहारा", "sahilakadhara"))
            mList!!.add(SongModel("9— मीरा बाई", "meerabai"))
            mList!!.add(SongModel("10— महाभारत (चीर पर्व)", "chirparv"))
            mList!!.add(SongModel("11— कीचक पर्व", "kichakparv"))
            mList!!.add(SongModel("12— नौटंकी", "notanki"))
            mList!!.add(SongModel("13— पदमावत ", "padmavat"))
            mList!!.add(SongModel("14— चन्दकिरण", "chandkiran"))
            mList!!.add(SongModel("15— ज्यानी चोर", "jaynichor"))
            mList!!.add(SongModel("16— हीर रांझा", "heerranja"))
            mList!!.add(SongModel("17— उपदेशक भजन", "updashek"))*/
            return mList as ArrayList<JsonDataModel.Data>
        }

    /*private fun getQueryData(db: FirebaseFirestore) {

        pb.visibility = View.VISIBLE
        db.collection("Songs")
                .orderBy("id")
                .get()
                .addOnSuccessListener { result ->

                    val model: MutableList<JsonDataModel.Data> = result.toObjects(JsonDataModel.Data::class.java)
                    mList?.clear()


                    pb.visibility = View.INVISIBLE

                    model.forEach {
                        println(it.id.toString() + " " + it.name + it.dataList?.size)
                        mList!!.add(it)
                    }

                    mAdapter = SongAdapter(mList, this@SubChildActivity, this)
                    recyclerView.adapter = mAdapter

                }
                .addOnFailureListener { exception ->
                    pb.visibility = View.INVISIBLE
                    Log.d(TAG, "Error getting documents: ", exception)
                }
    }*/


    override fun onSubClick(pos: Int) {
        val model = mdataModel.dataList?.get(pos)
        val intent = Intent(this@SubChildActivity, StoryActivity::class.java)
        intent.putExtra(Constants.SUB_ID, model!!.id)
        intent.putExtra(Constants.STORY, model.story ?: "-")

        startActivity(intent)

    }
}