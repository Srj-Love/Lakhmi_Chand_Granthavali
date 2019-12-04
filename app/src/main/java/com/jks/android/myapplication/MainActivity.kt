package com.jks.android.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore
import com.jks.android.myapplication.model.ChildSongModel
import com.jks.android.myapplication.model.DataModel
import com.jks.android.myapplication.model.SongDataModel
import java.util.*
import kotlin.collections.HashMap

class MainActivity : AppCompatActivity() {
    val TAG = MainActivity::class.java.simpleName
    lateinit var mDataModelList: MutableList<SongDataModel>

    var songList = hashMapOf(
            1 to "1— सत्यवान सावित्री",
            2 to "2— पूर्णमल",
            3 to "3— नल—दमयन्ती",
            4 to "4— राजा—हरिश्चन्द्र",
            5 to "5— चापसिंह",
            6 to "6— सेठ- ताराचंद",
            7 to "7—चन्द्रगुप्त  धर्ममालकी ",
            8 to "8— शाही — लकडहारा",
            9 to "9— मीरा बाई",
            10 to "10— महाभारत (चीर पर्व)",
            11 to "11— कीचक पर्व",
            12 to "12— नौटंकी",
            13 to "13— पदमावत ",
            14 to "14— चन्दकिरण",
            15 to "15— ज्यानी चोर",
            16 to "16— हीर रांझा",
            17 to "17— उपदेशक भजन"
    )

    var songSubList = hashMapOf(
            1 to "कथासार :— ",
            2 to "1- धर्म पुत्र कहैं नही दुखी कोये....  ",
            3 to "2- ले छत्री वरदान लिये जो ब्रह्मा....",
            4 to "3- सावित्री नै समय पै आकै सिर.... ",
            5 to "4- तनै सावित्री का भी कुछ....    ",
            6 to "5- वेद रीत और हवन कुण्ड....  ",
            7 to "6-मैं फिर लिया जगत जहान मैं....  ",
            8 to "7-जवान अवस्था देख कै बोल्या.... ",
            9 to "8-हे प्रभू मन मोहवण ने या....  ",
            10 to "9-झट हाथ जोड कै लडकी....  ",
            11 to "10- मेरे सिर पै खोटा मन्दा....  ",
            12 to "11- नारद जी बोले कुछ पहचान....  ",
            13 to "12-सब सामग्री कट्ठी करकै बडा....  ",
            14 to "13-राज पाठ छूटै जिनका.... ",
            15 to "14-दूम्मतसैन सूण बात मेरी मैं.... ",
            16 to "15-अपणी शरण के मैं ले ले तेरे.... ",
            17 to "16- आ री बहू, दिल प्यारी बहू.... ",
            18 to "17-  शादी करी मेरे पुत्र की मेरे....  ",
            19 to "18-पिता के गए पे गहणे वस्त्र....",
            20 to "19-किसे तै ना भेद खोलै ख्याल.... ",
            21 to "20- तीन दिन और रात का एक.... ",
            22 to "21-सास ससुर और ब्राह्मणों को....",
            23 to "22- हो पिया मैं भी चलूंगी तेरी.... ",
            24 to "23-विकट बाट बणखण्ड का चलना....",
            25 to "24- फल लेने की इच्छा करकै जा.... ",
            26 to "25- सुसर की सुण कै हंसती चाली.... ",
            27 to "26- सावित्री मेरा हाथ पकड कोए.... ",
            28 to "27- नारद जी के कहे वचन का.... ",
            29 to "28- जंगल के मां बणा आश्रम.... ",
            30 to "29-एक महूर्त पिछै करण ने खुद....",
            31 to "30-पाछै—पाछै होली ध्यान में लगी.... ",
            32 to "31- ईश्वर का कर ध्यान लखूंगी.... ",
            33 to "32-अपणे जीवित पति के सिवा.... ",
            34 to "33- हाथ जोड कै धर्मराज से.... ",
            35 to "34- तेरे सास ससुर के धर्म कर्म.....  ",
            36 to "35- सब बातां की मौज होज्या जै....",
            37 to "36-सब के घर मैं थारी दया तै....  "
    )

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

        val mList = insertData()
// Create a new user with a first and last name


        mList.forEach {

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

    private fun insertData(): MutableList<SongDataModel> {

        songList.forEach {
            mDataModelList.add(
                    SongDataModel(it.key, it.value, it.value))
            )
        }
        return mDataModelList
    }

    private fun getQueryData(db: FirebaseFirestore) {
        db.collection("Songs")
                .orderBy("key")
                .get()
                .addOnSuccessListener { result ->
                    for (document in result) {
                        Log.d(TAG, "${document.id} => ${document.data}")
                        songSubList.forEach {
                            db.collection("Songs")
                                    .document(document.id)
                                    .set(it)
                                    .addOnSuccessListener { documentReference ->
                                        Log.d(TAG, "DocumentSnapshot added with ID: ${documentReference}")
                                    }
                                    .addOnFailureListener { e ->
                                        Log.w(TAG, "Error adding document", e)
                                    }
                        }

                    }
                }
                .addOnFailureListener { exception ->
                    Log.d(TAG, "Error getting documents: ", exception)
                }
    }
}