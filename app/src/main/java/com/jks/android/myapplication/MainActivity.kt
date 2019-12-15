package com.jks.android.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import com.google.common.reflect.TypeToken
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.firestore.FirebaseFirestore
import com.google.gson.GsonBuilder
import com.google.gson.stream.JsonReader
import com.jks.android.myapplication.model.JsonDataModel
import com.jks.android.myapplication.model.SongDataModel
import com.jks.android.myapplication.ui.CommentActivity
import com.jks.android.myapplication.utils.Constants
import com.jks.android.myapplication.utils.UserPref
import kotlinx.android.synthetic.main.activity_main.*
import java.io.IOException
import java.io.InputStream
import java.io.StringReader
import java.nio.charset.Charset


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    val TAG = MainActivity::class.java.simpleName
    lateinit var mDataModelList: MutableList<SongDataModel>


    private val button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button1 = findViewById<Button>(R.id.Button1)
        val button2 = findViewById<Button>(R.id.Button2)

        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        mDataModelList = arrayListOf()
        // Write a message to the database
        val db = FirebaseFirestore.getInstance()
        val dbRef = db.collection("Songs")

        val toggle = ActionBarDrawerToggle(this, drawer, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        nv.setNavigationItemSelectedListener(this)
        iv_main_img.isLongClickable = true
        iv_main_img.setOnLongClickListener {

            showAdminPopup()
            false
        }

//        getQueryData(db)

//        val mList = insertData()

//        insertData(db)




        button1.setOnClickListener {
            val intent = Intent(this@MainActivity, kavip::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener { v: View? ->
            val intent = Intent(this@MainActivity, saang::class.java)
            startActivity(intent)
        }
        /* button4.setOnClickListener { v: View? ->
             val intent = Intent(this@MainActivity, contectus::class.java)
             startActivity(intent)
         }*/

        /*btn_bkmrk.setOnClickListener {
            Intent(this@MainActivity, saang::class.java).apply {
                putExtra(Constants.BOOkMARK, true)
                startActivity(this)
            }
        }*/

        /* btn_cmnt.setOnClickListener {
             Intent(this@MainActivity, CommentActivity::class.java).apply {
                 startActivity(this)
             }
         }*/
        val textView = findViewById<TextView>(R.id.textView)
        textView.isSelected = true
    }

    private fun showAdminPopup() {
        val database = FirebaseDatabase.getInstance().reference // connection


        var alertDialogBuilder = androidx.appcompat.app.AlertDialog.Builder(this)


        val view = layoutInflater.inflate(R.layout.dialog_admin, null);
        alertDialogBuilder.setView(view)


        val userInput = view.findViewById(R.id.et_admin_pwd) as EditText

        alertDialogBuilder
                .setCancelable(false)
                .setPositiveButton("Save",
                        { dialog, id ->
                            dialog?.dismiss()

                            //save if it is  admin or not

                            val pwd = database.child("admin_pwd")
                            pwd.addValueEventListener(object : ValueEventListener {
                                override fun onCancelled(p0: DatabaseError) {

                                }

                                override fun onDataChange(dataSnapshot: DataSnapshot) {
                                    val pass = dataSnapshot.getValue()

                                    if (pass != null) {
                                        if (pass.equals(userInput.text.toString())) { // check server password with device password
                                            UserPref.getInstance(this@MainActivity).isAdmin = true
                                            Toast.makeText(this@MainActivity, "PIN Correct", Toast.LENGTH_SHORT).show()
                                        } else {
                                            UserPref.getInstance(this@MainActivity).isAdmin = false
                                            Toast.makeText(this@MainActivity, "PIN Incorrect", Toast.LENGTH_SHORT).show()
                                        }
                                    }

                                }
                            })


                        })
                .setNegativeButton("Cancel",
                        { dialog, id -> dialog.cancel() })

        alertDialogBuilder.create().show()

    }

    private fun insertData(db: FirebaseFirestore) {
        val jsonString = getAssetsJSON("Data.json")

        val groupListType = object : TypeToken<ArrayList<JsonDataModel.Data>>() {}.type
        val gson = GsonBuilder().create()
        val modelDataList: List<JsonDataModel.Data> = gson.fromJson(jsonString, groupListType)


        modelDataList.forEach {
            //            println(it.dATA?.get(0)?.name)
            /*println(it.id.toString() + it.name)

            it.dataList?.forEach { its ->
                println(it.id.toString() + it.name + its.id.toString())

            }*/


            // Add a new document with a generated ID
            val docId = db.collection("Songs")
                    .document().id
//              Log.d(TAG, "Doc ID: $docId")

            db.collection("Songs")
                    .document(docId)
                    .set(it)
                    .addOnSuccessListener { documentReference ->

                        Log.d(TAG, "DocumentSnapshot added with ID: $documentReference")
                    }
                    .addOnFailureListener { e ->
                        Log.w(TAG, "Error adding document", e)
                    }
        }
    }


    private fun getQueryData(db: FirebaseFirestore) {
        db.collection("Songs")
                .orderBy("key")
                .get()
                .addOnSuccessListener { result ->
                    for (document in result) {
                        Log.d(TAG, "${document.id} => ${document.data}")
                        /*songSubList.forEach {
                            db.collection("Songs")
                                    .document(document.id)
                                    .set(it)
                                    .addOnSuccessListener { documentReference ->
                                        Log.d(TAG, "DocumentSnapshot added with ID: ${documentReference}")
                                    }
                                    .addOnFailureListener { e ->
                                        Log.w(TAG, "Error adding document", e)
                                    }
                        }*/

                    }
                }
                .addOnFailureListener { exception ->
                    Log.d(TAG, "Error getting documents: ", exception)
                }
    }

    fun getWeatherObjectFromJson(jsonStr: String): List<JsonDataModel> {

        var stringReader: StringReader = StringReader(jsonStr)
        var jsonReader: JsonReader = JsonReader(stringReader)

        val gsonBuilder = GsonBuilder().serializeNulls()
        gsonBuilder.registerTypeAdapter(JsonDataModel::class.java, JsonDataModel())
        val gson = gsonBuilder.create()

        val weatherList: List<JsonDataModel> = gson.fromJson(stringReader, Array<JsonDataModel>::class.java).toList()

        return weatherList
    }


    // when user selects any menu item from drawer
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val id = item!!.itemId
        if (id == android.R.id.home) { //You can get

            closeOrOpenDrawer()
        }

        return super.onOptionsItemSelected(item)
    }

    /* Get File in Assets Folder */
    fun getAssetsJSON(fileName: String?): String? {
        var json: String? = null
        try {
            val inputStream: InputStream = this.assets.open(fileName)
            val size: Int = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()
            json = String(buffer, Charset.defaultCharset())
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return json
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {


            R.id.bookmark -> {
                closeOrOpenDrawer()
                Intent(this@MainActivity, saang::class.java).apply {
                    putExtra(Constants.BOOkMARK, true)
                    startActivity(this)
                }
            }
            R.id.cmnt -> {
                closeOrOpenDrawer()
                Intent(this@MainActivity, CommentActivity::class.java).apply {
                    startActivity(this)
                }
            }

        }
        return true
    }

    private fun closeOrOpenDrawer() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START, false)
        } else {
            drawer.openDrawer(GravityCompat.START)
        }
    }

}