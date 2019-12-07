package com.jks.android.myapplication.ui


import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.jks.android.myapplication.R
import com.jks.android.myapplication.adapter.SongChildAdapter
import com.jks.android.myapplication.model.JsonDataModel
import com.jks.android.myapplication.utils.Constants
import kotlinx.android.synthetic.main.activity_story.*


class StoryActivity : AppCompatActivity(), SongChildAdapter.SongClickListener {

    val TAG = StoryActivity::class.java.simpleName


    var mAdapter: SongChildAdapter? = null
    var mList: ArrayList<JsonDataModel.Data>? = null
    lateinit var recyclerView: RecyclerView
    lateinit var mdataModel: JsonDataModel.Data

    val WEBPAGE_HEADER = "<html>\n" +
            "\n" +
            "<head>\n" +
            "    <meta charset=\"utf-8\"/><style>#D{text-decoration:none;    color:#0000FF;    position:fixed;    bottom:0px;}</style>\n" +
            "\n" +
            "    \n" +
            "</head>\n" +
            "\n" +
            "\n" +
            "<body bgcolor=\"#EBFFFF\"> <font size=\"3px\">\n"

    var WEBPAGE_BODY = ""
    val WEBPAGE_FOOTER = "</font>\n" +
            "</body>"


    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story)


        if (supportActionBar != null) supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        if (intent.hasExtra(Constants.STORY)) {
            WEBPAGE_BODY = intent.getStringExtra(Constants.STORY)
        }


        val data = WEBPAGE_HEADER.plus(WEBPAGE_BODY).plus(WEBPAGE_FOOTER)
        web_story.settings.javaScriptEnabled = true
        web_story.isLongClickable = false
        web_story.isHapticFeedbackEnabled = false

        web_story.setOnLongClickListener {
            // For final release of your app, comment the toast notification
            Toast.makeText(this@StoryActivity, "Long Click Disabled", Toast.LENGTH_SHORT).show()
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
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item!!.itemId === R.id.bookmark) {
            item!!.isChecked = !item.isChecked
            item.setIcon(if (item.isChecked) R.drawable.ic_bookmark_filled else R.drawable.ic_bookmark_outline)
            return true
        }
        return false
    }


    override fun onSubClick(pos: Int) {

    }
}