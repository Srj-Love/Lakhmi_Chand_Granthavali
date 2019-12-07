package com.jks.android.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.common.reflect.TypeToken
import com.google.firebase.firestore.FirebaseFirestore
import com.google.gson.GsonBuilder
import com.google.gson.stream.JsonReader
import com.jks.android.myapplication.model.JsonDataModel
import com.jks.android.myapplication.model.SongDataModel
import java.io.IOException
import java.io.InputStream
import java.io.StringReader
import java.nio.charset.Charset


class MainActivity : AppCompatActivity() {
    val TAG = MainActivity::class.java.simpleName
    lateinit var mDataModelList: MutableList<SongDataModel>




    private val button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1 = findViewById<Button>(R.id.Button1)
        val button2 = findViewById<Button>(R.id.Button2)
        val button4 = findViewById<Button>(R.id.Button4)

        mDataModelList = arrayListOf()
        // Write a message to the database
        val db = FirebaseFirestore.getInstance()
        val dbRef = db.collection("Songs")

//        getQueryData(db)

//        val mList = insertData()

//        insertData(db)


        /*mList.forEach {

            // Add a new document with a generated ID
            val docId = db.collection("Songs")
                    .document().id
            Log.d(TAG, "Doc ID: $docId")





            db.collection("Songs")
                    .document(docId)
                    .set(it)
                    .addOnSuccessListener { documentReference ->

                        Log.d(TAG, "DocumentSnapshot added with ID: $documentReference")
                    }
                    .addOnFailureListener { e ->
                        Log.w(TAG, "Error adding document", e)
                    }
        }*/


        button1.setOnClickListener {
            val intent = Intent(this@MainActivity, kavip::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener { v: View? ->
            val intent = Intent(this@MainActivity, saang::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener { v: View? ->
            val intent = Intent(this@MainActivity, contectus::class.java)
            startActivity(intent)
        }
        val textView = findViewById<TextView>(R.id.textView)
        textView.isSelected = true
    }

    private fun insertData(db: FirebaseFirestore) {
        val jsonString = getAssetsJSON("Data.json")

        val groupListType = object : TypeToken<ArrayList<JsonDataModel.Data>>() {}.type
        val gson = GsonBuilder().create()
        val modelDataList: List<JsonDataModel.Data> = gson.fromJson(jsonString, groupListType)


        modelDataList.forEach {
            //            println(it.dATA?.get(0)?.name)
            println(it.name)

            // Add a new document with a generated ID
            val docId = db.collection("Songs")
                    .document().id
            Log.d(TAG, "Doc ID: $docId")

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
}