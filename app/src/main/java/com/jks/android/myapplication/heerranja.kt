package com.jks.android.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class heerranja : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heerranja)
        val button1 = findViewById<View>(R.id.hrk) as Button
        val button2 = findViewById<View>(R.id.hr1) as Button
        val button3 = findViewById<View>(R.id.hr2) as Button
        val button4 = findViewById<View>(R.id.hr3) as Button
        val button5 = findViewById<View>(R.id.hr4) as Button
        val button6 = findViewById<View>(R.id.hr5) as Button
        val button7 = findViewById<View>(R.id.hr6) as Button
        val button8 = findViewById<View>(R.id.hr7) as Button
        val button9 = findViewById<View>(R.id.hr8) as Button
        val button10 = findViewById<View>(R.id.hr9) as Button
        val button11 = findViewById<View>(R.id.hr10) as Button
        val button12 = findViewById<View>(R.id.hr11) as Button
        val button13 = findViewById<View>(R.id.hr12) as Button
        val button14 = findViewById<View>(R.id.hr13) as Button
        val button15 = findViewById<View>(R.id.hr14) as Button
        val button16 = findViewById<View>(R.id.hr15) as Button
        val button17 = findViewById<View>(R.id.hr16) as Button
        val button18 = findViewById<View>(R.id.hr17) as Button
        val button19 = findViewById<View>(R.id.hr18) as Button
        val button20 = findViewById<View>(R.id.hr19) as Button
        val button21 = findViewById<View>(R.id.hr20) as Button
        val button22 = findViewById<View>(R.id.hr21) as Button
        val button23 = findViewById<View>(R.id.hr22) as Button
        val button24 = findViewById<View>(R.id.hr23) as Button
        val button25 = findViewById<View>(R.id.hr24) as Button
        val button26 = findViewById<View>(R.id.hr25) as Button
        val button27 = findViewById<View>(R.id.hr26) as Button
        val button28 = findViewById<View>(R.id.hr27) as Button
        val button29 = findViewById<View>(R.id.hr28) as Button
        val button30 = findViewById<View>(R.id.hr29) as Button
        val button31 = findViewById<View>(R.id.hr30) as Button
        val button32 = findViewById<View>(R.id.hr31) as Button
        val button33 = findViewById<View>(R.id.hr32) as Button
        val button34 = findViewById<View>(R.id.hr33) as Button
        val button35 = findViewById<View>(R.id.hr34) as Button
        val button36 = findViewById<View>(R.id.hr35) as Button
        val button37 = findViewById<View>(R.id.hr36) as Button
        val button38 = findViewById<View>(R.id.hr37) as Button
        val button39 = findViewById<View>(R.id.hr38) as Button
        val button40 = findViewById<View>(R.id.hr39) as Button
        val button41 = findViewById<View>(R.id.hr40) as Button
        val button42 = findViewById<View>(R.id.hr41) as Button
        val button43 = findViewById<View>(R.id.hr42) as Button
        val button44 = findViewById<View>(R.id.hr43) as Button

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
                        button44.text.toString()
        ).forEach {
            println(it)
        }

        button1.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hrk")
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr1")
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr2")
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr3")
            startActivity(intent)
        }
        button5.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr4")
            startActivity(intent)
        }
        button6.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr5")
            startActivity(intent)
        }
        button7.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr6")
            startActivity(intent)
        }
        button8.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr7")
            startActivity(intent)
        }
        button9.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr8")
            startActivity(intent)
        }
        button10.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr9")
            startActivity(intent)
        }
        button11.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr10")
            startActivity(intent)
        }
        button12.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr11")
            startActivity(intent)
        }
        button13.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr12")
            startActivity(intent)
        }
        button14.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr13")
            startActivity(intent)
        }
        button15.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr14")
            startActivity(intent)
        }
        button16.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr15")
            startActivity(intent)
        }
        button17.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr16")
            startActivity(intent)
        }
        button18.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr17")
            startActivity(intent)
        }
        button19.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr18")
            startActivity(intent)
        }
        button20.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr19")
            startActivity(intent)
        }
        button21.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr20")
            startActivity(intent)
        }
        button22.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr21")
            startActivity(intent)
        }
        button23.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr22")
            startActivity(intent)
        }
        button24.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr23")
            startActivity(intent)
        }
        button25.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr24")
            startActivity(intent)
        }
        button26.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr25")
            startActivity(intent)
        }
        button27.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr26")
            startActivity(intent)
        }
        button28.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr27")
            startActivity(intent)
        }
        button29.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr28")
            startActivity(intent)
        }
        button30.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr29")
            startActivity(intent)
        }
        button31.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr30")
            startActivity(intent)
        }
        button32.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr31")
            startActivity(intent)
        }
        button33.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr32")
            startActivity(intent)
        }
        button34.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr33")
            startActivity(intent)
        }
        button35.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr34")
            startActivity(intent)
        }
        button36.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr35")
            startActivity(intent)
        }
        button37.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr36")
            startActivity(intent)
        }
        button38.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr37")
            startActivity(intent)
        }
        button39.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr38")
            startActivity(intent)
        }
        button40.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr39")
            startActivity(intent)
        }
        button41.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr40")
            startActivity(intent)
        }
        button42.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr41")
            startActivity(intent)
        }
        button43.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr42")
            startActivity(intent)
        }
        button44.setOnClickListener {
            val intent = Intent(this@heerranja, Data::class.java).putExtra("id", "hr43")
            startActivity(intent)
        }
    }
}