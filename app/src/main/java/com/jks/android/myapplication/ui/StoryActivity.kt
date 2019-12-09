package com.jks.android.myapplication.ui


import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.jks.android.myapplication.R
import com.jks.android.myapplication.adapter.SongChildAdapter
import com.jks.android.myapplication.db.SqlDbHelper
import com.jks.android.myapplication.model.JsonDataModel
import com.jks.android.myapplication.saang
import com.jks.android.myapplication.utils.Constants
import com.jks.android.myapplication.utils.Constants.Companion.WEBPAGE_FOOTER
import com.jks.android.myapplication.utils.Constants.Companion.WEBPAGE_HEADER
import com.jks.android.myapplication.utils.convertToJson
import kotlinx.android.synthetic.main.activity_story.*


class StoryActivity : AppCompatActivity() {

    val TAG = StoryActivity::class.java.simpleName


    var mAdapter: SongChildAdapter? = null
    var mList: ArrayList<JsonDataModel.Data>? = null
    lateinit var recyclerView: RecyclerView
    lateinit var mdataModel: JsonDataModel.Data

    val dbHelper: SqlDbHelper by lazy {
        SqlDbHelper(this@StoryActivity)
    }


    var WEBPAGE_BODY = ""

    var isBookmark = false

    var ID: Int = 0
    var sub_id: Int = 0
    lateinit var NAME: String
    lateinit var sub_name: String

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story)


        if (supportActionBar != null) supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        ID = intent.getIntExtra(Constants.ID, 0)
        sub_id = intent.getIntExtra(Constants.SUB_ID, 0)
        NAME = intent.getStringExtra(Constants.NAME)
        sub_name = intent.getStringExtra(Constants.SUB_NAME)


        if (intent.hasExtra(Constants.STORY)) {
            WEBPAGE_BODY = intent.getStringExtra(Constants.STORY)
        }

        if (intent.hasExtra(Constants.BOOkMARK)) {
            isBookmark = intent.getBooleanExtra(Constants.BOOkMARK, false)
        }


        val data = WEBPAGE_HEADER.plus(WEBPAGE_BODY).plus(WEBPAGE_FOOTER)

        web_story.settings.javaScriptEnabled = true
        web_story.isLongClickable = false
        web_story.isHapticFeedbackEnabled = false

        web_story.setOnLongClickListener {
            true
        }

        web_story.setWebViewClient(object : WebViewClient() {
            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {}
            override fun onPageFinished(view: WebView?, url: String?) {}
        })

        web_story.setWebChromeClient(object : WebChromeClient() {
            override fun onProgressChanged(view: WebView?, newProgress: Int) {}
        })
        web_story.loadData(data, "text/html", "utf-8")

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_bookmark, menu)
        if (isBookmark) {
            menu?.findItem(R.id.bookmark)?.icon = ContextCompat.getDrawable(this@StoryActivity, R.drawable.ic_bookmark_filled)
        } else {
            menu?.findItem(R.id.bookmark)?.icon = ContextCompat.getDrawable(this@StoryActivity, R.drawable.ic_bookmark_outline)
        }
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item!!.itemId === R.id.bookmark) {

            item!!.isChecked = !item.isChecked
            //item.setIcon(if (item.isChecked) R.drawable.ic_bookmark_filled else R.drawable.ic_bookmark_outline)

            // checki if user pressing the check or unchecked
            if (isBookmark) {
                alertBookmark(item)
            } else {
                addBookmark()
                item.setIcon(R.drawable.ic_bookmark_filled)
            }


            /*if (item.isChecked) {
                item.setIcon(R.drawable.ic_bookmark_filled)
                addBookmark()
            } else if (!item.isChecked) {
                if (isBookmark) {
                    alertBookmark(item)
                } else {
                    addBookmark()
                    item.setIcon(R.drawable.ic_bookmark_filled)

                }
                item.setIcon(R.drawable.ic_bookmark_outline)
                //    msg("removed from Bookmark")
            }*/

            return true
        }
        return false
    }

    private fun alertBookmark(item: MenuItem) {
        AlertDialog.Builder(this)
                .setMessage(getString(R.string.remove_alert))
                .setPositiveButton(getString(R.string.remove)) { dialog, which ->
                    dialog.dismiss()
                    val delId = dbHelper.removeBookmark(sub_id)
                    item.setIcon(R.drawable.ic_bookmark_filled)
                    if (delId > 0) {
                        finish()
                        Intent(this@StoryActivity, saang::class.java).apply {
                            putExtra(Constants.BOOkMARK, true)
                            startActivity(this)
                        }
                    }
                }.setNegativeButton(getString(R.string.cancel)) { dialog, which ->
                    dialog.dismiss()
                }.show()
    }


    private fun addBookmark() {

        val sumModel = JsonDataModel.DataStoryList().apply {
            this.id = sub_id
            name = sub_name
            story = WEBPAGE_BODY
        }

        val model = JsonDataModel.Data().apply {
            this.id = ID
            this.name = NAME
            dataList = arrayListOf(sumModel)
        }

        val id = dbHelper.addData(model)
        if (id != null) {
            if (id > 0) {
                isBookmark = true
                msg(getString(R.string.bkmrk_added))

            }
        }
        println(convertToJson(model))

    }

    private fun msg(msg: String) {
        Toast.makeText(this@StoryActivity, msg, Toast.LENGTH_LONG).show()
    }


}