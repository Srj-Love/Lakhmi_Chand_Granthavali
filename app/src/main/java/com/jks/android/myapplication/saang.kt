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


        // check if user pressed bookmark button or Katha Sangrah Button
        if (isBookmark) {
            getBookmarkData() // load bookmark data
        } else {
            getQueryData(db) // load server data
        }


    }

    private fun getBookmarkData() {
        pb.visibility = View.GONE
        mList?.clear()
        mList = dbHelper.readAllData()

        mAdapter = SongAdapter(mList, this@saang, this)
        recyclerView.adapter = mAdapter

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
                    Toast.makeText(this@saang, "Error getting documents:",Toast.LENGTH_SHORT).show()
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