package com.jks.android.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class meerabai : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meerabai)
        val button1 = findViewById<View>(R.id.mbk) as Button
        val button2 = findViewById<View>(R.id.mb1) as Button
        val button3 = findViewById<View>(R.id.mb2) as Button
        val button4 = findViewById<View>(R.id.mb3) as Button
        val button5 = findViewById<View>(R.id.mb4) as Button
        val button6 = findViewById<View>(R.id.mb5) as Button
        val button7 = findViewById<View>(R.id.mb6) as Button
        val button8 = findViewById<View>(R.id.mb7) as Button
        val button9 = findViewById<View>(R.id.mb8) as Button
        val button10 = findViewById<View>(R.id.mb9) as Button
        val button11 = findViewById<View>(R.id.mb10) as Button
        val button12 = findViewById<View>(R.id.mb11) as Button
        val button13 = findViewById<View>(R.id.mb12) as Button
        val button14 = findViewById<View>(R.id.mb13) as Button
        val button15 = findViewById<View>(R.id.mb14) as Button
        val button16 = findViewById<View>(R.id.mb15) as Button
        val button17 = findViewById<View>(R.id.mb16) as Button
        val button18 = findViewById<View>(R.id.mb17) as Button
        val button19 = findViewById<View>(R.id.mb18) as Button
        val button20 = findViewById<View>(R.id.mb19) as Button
        val button21 = findViewById<View>(R.id.mb20) as Button
        val button22 = findViewById<View>(R.id.mb21) as Button
        val button23 = findViewById<View>(R.id.mb22) as Button
        val button24 = findViewById<View>(R.id.mb23) as Button
        val button25 = findViewById<View>(R.id.mb24) as Button
        val button26 = findViewById<View>(R.id.mb25) as Button
        val button27 = findViewById<View>(R.id.mb26) as Button
        val button28 = findViewById<View>(R.id.mb27) as Button
        val button29 = findViewById<View>(R.id.mb28) as Button
        val button30 = findViewById<View>(R.id.mb29) as Button
        val button31 = findViewById<View>(R.id.mb30) as Button
        val button32 = findViewById<View>(R.id.mb31) as Button
        val button33 = findViewById<View>(R.id.mb32) as Button
        val button34 = findViewById<View>(R.id.mb33) as Button
        val button35 = findViewById<View>(R.id.mb34) as Button
        val button36 = findViewById<View>(R.id.mb35) as Button
        val button37 = findViewById<View>(R.id.mb36) as Button
        val button38 = findViewById<View>(R.id.mb37) as Button
        val button39 = findViewById<View>(R.id.mb38) as Button
        val button40 = findViewById<View>(R.id.mb39) as Button
        val button41 = findViewById<View>(R.id.mb40) as Button
        val button42 = findViewById<View>(R.id.mb41) as Button
        val button43 = findViewById<View>(R.id.mb42) as Button
        val button44 = findViewById<View>(R.id.mb43) as Button
        val button45 = findViewById<View>(R.id.mb44) as Button
        val button46 = findViewById<View>(R.id.mb45) as Button
        val button47 = findViewById<View>(R.id.mb46) as Button
        val button48 = findViewById<View>(R.id.mb47) as Button
        val button49 = findViewById<View>(R.id.mb48) as Button
        val button50 = findViewById<View>(R.id.mb49) as Button
        val button51 = findViewById<View>(R.id.mb50) as Button

        arrayListOf(
                button1.text.toString(),
                button2.text.toString(),
                button3.text.toString(),
                button4.text.toString(),
                button5.text.toString(),
                button6.text.toString(),
                button7.text.toString(),
                button8.text.toString(),
                button9.text.toString(),
                button10.text.toString(),
                button11.text.toString(),
                button12.text.toString(),
                button13.text.toString(),
                button14.text.toString(),
                button15.text.toString(),
                button16.text.toString(),
                button17.text.toString(),
                button18.text.toString(),
                button19.text.toString(),
                button20.text.toString(),
                button21.text.toString(),
                button22.text.toString(),
                button23.text.toString(),
                button24.text.toString(),
                button25.text.toString(),
                button26.text.toString(),
                button27.text.toString(),
                button28.text.toString(),
                button29.text.toString(),
                button30.text.toString(),
                button31.text.toString(),
                button32.text.toString(),
                button33.text.toString(),
                button34.text.toString(),
                button35.text.toString(),
                button36.text.toString(),
                button37.text.toString(),
                button38.text.toString(),
                button39.text.toString(),
                button40.text.toString(),
                button41.text.toString(),
                button42.text.toString(),
                button43.text.toString(),
                button44.text.toString(),
                button45.text.toString(),
                button46.text.toString(),
                button47.text.toString(),
                button48.text.toString(),
                button49.text.toString(),
                button50.text.toString(),
                button51.text.toString()
        ).forEach {
            println(it)
        }

        button1.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mbk")
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb1")
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb2")
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb3")
            startActivity(intent)
        }
        button5.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb4")
            startActivity(intent)
        }
        button6.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb5")
            startActivity(intent)
        }
        button7.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb6")
            startActivity(intent)
        }
        button8.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb7")
            startActivity(intent)
        }
        button9.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb8")
            startActivity(intent)
        }
        button10.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb9")
            startActivity(intent)
        }
        button11.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb10")
            startActivity(intent)
        }
        button12.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb11")
            startActivity(intent)
        }
        button13.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb12")
            startActivity(intent)
        }
        button14.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb13")
            startActivity(intent)
        }
        button15.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb14")
            startActivity(intent)
        }
        button16.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb15")
            startActivity(intent)
        }
        button17.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb16")
            startActivity(intent)
        }
        button18.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb17")
            startActivity(intent)
        }
        button19.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb18")
            startActivity(intent)
        }
        button20.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb19")
            startActivity(intent)
        }
        button21.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb20")
            startActivity(intent)
        }
        button22.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb21")
            startActivity(intent)
        }
        button23.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb22")
            startActivity(intent)
        }
        button24.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb23")
            startActivity(intent)
        }
        button25.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb24")
            startActivity(intent)
        }
        button26.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb25")
            startActivity(intent)
        }
        button27.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb26")
            startActivity(intent)
        }
        button28.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb27")
            startActivity(intent)
        }
        button29.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb28")
            startActivity(intent)
        }
        button30.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb29")
            startActivity(intent)
        }
        button31.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb30")
            startActivity(intent)
        }
        button32.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb31")
            startActivity(intent)
        }
        button33.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb32")
            startActivity(intent)
        }
        button34.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb33")
            startActivity(intent)
        }
        button35.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb34")
            startActivity(intent)
        }
        button36.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb35")
            startActivity(intent)
        }
        button37.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb36")
            startActivity(intent)
        }
        button38.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb37")
            startActivity(intent)
        }
        button39.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb38")
            startActivity(intent)
        }
        button40.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb39")
            startActivity(intent)
        }
        button41.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb40")
            startActivity(intent)
        }
        button42.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb41")
            startActivity(intent)
        }
        button43.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb42")
            startActivity(intent)
        }
        button44.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb43")
            startActivity(intent)
        }
        button45.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb44")
            startActivity(intent)
        }
        button46.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb45")
            startActivity(intent)
        }
        button47.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb46")
            startActivity(intent)
        }
        button48.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb47")
            startActivity(intent)
        }
        button49.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb48")
            startActivity(intent)
        }
        button50.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb49")
            startActivity(intent)
        }
        button51.setOnClickListener {
            val intent = Intent(this@meerabai, Data::class.java).putExtra("id", "mb50")
            startActivity(intent)
        }
    }
}