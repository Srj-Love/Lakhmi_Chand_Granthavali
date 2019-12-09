package com.jks.android.myapplication.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
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
import kotlinx.android.synthetic.main.activity_cmnt.*
import kotlinx.android.synthetic.main.activity_saang.*

class CommentActivity : AppCompatActivity() {

    val TAG = CommentActivity::class.java.simpleName


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cmnt)

        if (supportActionBar != null) supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val db = FirebaseFirestore.getInstance()

        button_chatbox_send.setOnClickListener {
            insertData(db)
        }

    }


    private fun insertData(db: FirebaseFirestore) {

        val msg = edittext_chatbox.text.toString()
        val docData = hashMapOf(
                "msg" to "$msg"
        )
        // Add a new document with a generated ID
        val docId = db.collection("Comment")
                .document().id
//              Log.d(TAG, "Doc ID: $docId")

        db.collection("Comment")
                .document(docId)
                .set(docData)
                .addOnSuccessListener { documentReference ->

                    Log.d(TAG, "DocumentSnapshot added with ID: $documentReference")
                }
                .addOnFailureListener { e ->
                    Log.w(TAG, "Error adding document", e)
                }
    }
}