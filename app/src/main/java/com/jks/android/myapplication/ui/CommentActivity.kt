package com.jks.android.myapplication.ui

import android.graphics.ColorSpace.Model
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.firebase.ui.database.FirebaseRecyclerOptions
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.FirebaseFirestore
import com.jks.android.myapplication.model.CommentModel
import com.jks.android.myapplication.model.User
import kotlinx.android.synthetic.main.activity_cmnt.*


class CommentActivity : AppCompatActivity() {

    val TAG = CommentActivity::class.java.simpleName

    private lateinit var database: DatabaseReference

    companion object {
        const val COLLECTION_KEY = "Chat"
        const val DOCUMENT_KEY = "Message"
        const val NAME_FIELD = "Name"
        const val TEXT_FIELD = "Text"
        const val TEXT_IS_ADMIN = "IsAdmin"
        const val COLLECTION_NAME = "Comment"
        const val DOCUMENT_USER = "User"


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cmnt)

        if (supportActionBar != null) supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val db = FirebaseFirestore.getInstance()
        database = FirebaseDatabase.getInstance().reference

        button_chatbox_send.setOnClickListener {
            //            insertData(db)
            sendMessage(db)
        }

    }


    private fun insertData(db: FirebaseFirestore) {

        val msg = edittext_chatbox.text.toString()
        val docData = hashMapOf(
                "msg" to msg
        )
        // Add a new document with a generated ID
        val docId = db.collection(COLLECTION_NAME)
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

    private fun sendMessage(db: FirebaseFirestore) {


        val msg = edittext_chatbox.text.toString()
                .trimIndent()


        val model = CommentModel(false, msg = msg)
        database.child("User")
                .push()
                .setValue(model)

        val query = FirebaseDatabase.getInstance()
                .reference
                .child("User")
                .orderByKey("score")

        val options = FirebaseRecyclerOptions.Builder<CommentModel>()
                .setQuery(query) { snapshot ->
                    CommentModel(snapshot.child("isAdmin").value.toString(),
                            snapshot.child("date").value.toString())
                }
                .build()


    }
}