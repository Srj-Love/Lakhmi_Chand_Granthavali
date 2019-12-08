package com.jks.android.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.firestore.FirebaseFirestore
import com.google.gson.JsonObject
import com.jks.android.myapplication.adapter.SongAdapter
import com.jks.android.myapplication.adapter.SongAdapter.SongClickListener
import com.jks.android.myapplication.db.SqlDbHelper
import com.jks.android.myapplication.model.JsonDataModel
import com.jks.android.myapplication.ui.SubChildActivity
import com.jks.android.myapplication.utils.Constants
import com.jks.android.myapplication.utils.convertToJson
import kotlinx.android.synthetic.main.activity_saang.*

class saang : AppCompatActivity(), SongClickListener {

    private var isBookmark: Boolean = false
    val TAG = saang::class.java.simpleName

    val dbHelper: SqlDbHelper by lazy {
        SqlDbHelper(this@saang)
    }

    var mAdapter: SongAdapter? = null
    var mList: ArrayList<JsonDataModel.Data>? = null
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saang)


        if (supportActionBar != null) supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        recyclerView = findViewById(R.id.rcv_song)

        if (intent.hasExtra(Constants.BOOkMARK)) {
            isBookmark = intent.getBooleanExtra(Constants.BOOkMARK, false)
        }

        val db = FirebaseFirestore.getInstance()


        mList = ArrayList()

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this@saang)
        recyclerView.addItemDecoration(DividerItemDecoration(this@saang, DividerItemDecoration.HORIZONTAL))

        if (isBookmark) {
            getBookmarkData()
        } else {
            getQueryData(db)
        }


    }

    private fun getBookmarkData() {
        pb.visibility = View.GONE
        mList?.clear()
        mList = dbHelper.readAllData()

        mAdapter = SongAdapter(mList, this@saang, this)
        recyclerView.adapter = mAdapter

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

    private fun getQueryData(db: FirebaseFirestore) {

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

                    mAdapter = SongAdapter(mList, this@saang, this)
                    recyclerView.adapter = mAdapter

                }
                .addOnFailureListener { exception ->
                    pb.visibility = View.INVISIBLE
                    Log.d(TAG, "Error getting documents: ", exception)
                }
    }

    override fun onClick(pos: Int) {
        try {
            /*val mIntent = Intent(this@saang, Class.forName(packageName + "." + mList!![pos].classname))
            startActivity(mIntent)*/

            val model: JsonDataModel.Data? = mList?.get(pos)

            val jsonData: JsonObject? = model?.let { convertToJson(it) }
            val intent = Intent(this@saang, SubChildActivity::class.java)
            intent.putExtra(Constants.ID, model!!.id)
            intent.putExtra(Constants.NAME, model.name)
            intent.putExtra(Constants.SUB_ID, pos)
            intent.putExtra(Constants.BOOkMARK, isBookmark)
            intent.putExtra(Constants.EXTRA, jsonData.toString())

            startActivity(intent)

        } catch (e: ClassNotFoundException) {
            e.printStackTrace()
            Toast.makeText(this, "क्षमा करें, डेटा प्राप्त करने में असमर्थ", Toast.LENGTH_SHORT).show()
        }
    }
}