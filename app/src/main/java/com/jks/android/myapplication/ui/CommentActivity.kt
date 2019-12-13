package com.jks.android.myapplication.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.firebase.ui.database.FirebaseRecyclerAdapter
import com.firebase.ui.database.FirebaseRecyclerOptions
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.FirebaseFirestore
import com.jks.android.myapplication.R
import com.jks.android.myapplication.model.CommentModel
import com.jks.android.myapplication.ui.CommentActivity
import com.jks.android.myapplication.utils.UserPref
import kotlinx.android.synthetic.main.activity_cmnt.*
import kotlinx.android.synthetic.main.item_admin_cmnt_list.view.*


class CommentActivity : AppCompatActivity() {

    val TAG = CommentActivity::class.java.simpleName

    private lateinit var database: DatabaseReference
    private var adapter: FirebaseRecyclerAdapter<CommentModel, ServiceViewHolder>? = null
    lateinit var linearLayoutManager: LinearLayoutManager

    val pref: UserPref by lazy {
        UserPref.getInstance(this@CommentActivity)
    }

    companion object {
        const val COLLECTION_KEY = "Chat"
        const val DOCUMENT_KEY = "Message"
        const val NAME_FIELD = "Name"
        const val TEXT_FIELD = "Text"
        const val TEXT_IS_ADMIN = "IsAdmin"
        const val COLLECTION_NAME = "Comment"
        const val DOCUMENT_USER = "User"


    }

    override fun onStart() {
        super.onStart()

        initRCV()


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cmnt)

        if (supportActionBar != null) supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val db = FirebaseFirestore.getInstance()
        database = FirebaseDatabase.getInstance().reference

        rcv_message_list.setHasFixedSize(true)

        linearLayoutManager = LinearLayoutManager(this)
        rcv_message_list.layoutManager = linearLayoutManager

        button_chatbox_send.setOnClickListener {
            //            insertData(db)
            sendMessage(db)
        }

    }


    private fun sendMessage(db: FirebaseFirestore) {


        val msg = edittext_chatbox.text.toString()
                .trimIndent()


        val model = CommentModel(pref.isAdmin, msg = msg)

        database.child("User")
                .push()
                .setValue(model)


    }

    private fun initRCV() {
        val query = FirebaseDatabase.getInstance()
                .reference
                .child("User")

        val options: FirebaseRecyclerOptions<CommentModel> = FirebaseRecyclerOptions.Builder<CommentModel>()
                .setQuery(query, CommentModel::class.java)
                .build()

        adapter = object : FirebaseRecyclerAdapter<CommentModel, ServiceViewHolder>(options) {

            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ServiceViewHolder {
                val view = LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_admin_cmnt_list, parent, false)
                return ServiceViewHolder(view)


            }


            override fun onBindViewHolder(holder: ServiceViewHolder, position: Int, model: CommentModel) {


                if (model.admin!!) {
                    holder.ll_clnt.visibility = View.GONE
                    holder.rl_admin.visibility = View.VISIBLE
                    holder.tv_admin_message_body.text = model.msg
                } else {
                    holder.ll_clnt.visibility = View.VISIBLE
                    holder.rl_admin.visibility = View.GONE

                    holder.client_message_body.text = model.msg

                }

            }

        }

        adapter?.registerAdapterDataObserver(object : RecyclerView.AdapterDataObserver() {
            override fun onItemRangeInserted(positionStart: Int, itemCount: Int) {
                super.onItemRangeInserted(positionStart, itemCount)
                println("Somethingn is happened")

                val friendlyMessageCount: Int = adapter?.getItemCount()!!
                val lastVisiblePosition: Int = linearLayoutManager.findLastCompletelyVisibleItemPosition()
                // If the recycler view is initially being loaded or the
                // user is at the bottom of the list, scroll to the bottom
                // of the list to show the newly added message.
                // If the recycler view is initially being loaded or the
// user is at the bottom of the list, scroll to the bottom
// of the list to show the newly added message.
                if (lastVisiblePosition == -1 ||
                        positionStart >= friendlyMessageCount - 1 &&
                        lastVisiblePosition == positionStart - 1) {
                    rcv_message_list.scrollToPosition(positionStart)
                }
            }
        })

        rcv_message_list.adapter = adapter
        adapter?.startListening()

    }

    override fun onStop() {
        super.onStop()
        adapter?.stopListening();

    }

    open class ServiceViewHolder(itemView: View) : ViewHolder(itemView) {

        var tv_admin_message_body: TextView
        var client_message_body: TextView
        var rl_admin: LinearLayout
        var ll_clnt: LinearLayout


        init {
            val mView: View = itemView
            tv_admin_message_body = itemView.tv_admin_message_body
            client_message_body = itemView.tv_client_message_body
            rl_admin = itemView.rl_admin
            ll_clnt = itemView.ll_clnt

        }
    }


}