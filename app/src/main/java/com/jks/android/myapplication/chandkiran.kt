package com.jks.android.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class chandkiran : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chandkiran)
        val button1 = findViewById<View>(R.id.cdk) as Button
        val button2 = findViewById<View>(R.id.cd1) as Button
        val button3 = findViewById<View>(R.id.cd2) as Button
        val button4 = findViewById<View>(R.id.cd3) as Button
        val button5 = findViewById<View>(R.id.cd4) as Button
        val button6 = findViewById<View>(R.id.cd5) as Button
        val button7 = findViewById<View>(R.id.cd6) as Button
        val button8 = findViewById<View>(R.id.cd7) as Button
        val button9 = findViewById<View>(R.id.cd8) as Button
        val button10 = findViewById<View>(R.id.cd9) as Button
        val button11 = findViewById<View>(R.id.cd10) as Button
        val button12 = findViewById<View>(R.id.cd11) as Button
        val button13 = findViewById<View>(R.id.cd12) as Button
        val button14 = findViewById<View>(R.id.cd13) as Button
        val button15 = findViewById<View>(R.id.cd14) as Button
        val button16 = findViewById<View>(R.id.cd15) as Button
        val button17 = findViewById<View>(R.id.cd16) as Button
        val button18 = findViewById<View>(R.id.cd17) as Button
        val button19 = findViewById<View>(R.id.cd18) as Button
        val button20 = findViewById<View>(R.id.cd19) as Button
        val button21 = findViewById<View>(R.id.cd20) as Button
        val button22 = findViewById<View>(R.id.cd21) as Button
        val button23 = findViewById<View>(R.id.cd22) as Button
        val button24 = findViewById<View>(R.id.cd23) as Button
        val button25 = findViewById<View>(R.id.cd24) as Button
        val button26 = findViewById<View>(R.id.cd25) as Button
        val button27 = findViewById<View>(R.id.cd26) as Button
        val button28 = findViewById<View>(R.id.cd27) as Button
        val button29 = findViewById<View>(R.id.cd28) as Button
        val button30 = findViewById<View>(R.id.cd29) as Button
        val button31 = findViewById<View>(R.id.cd30) as Button
        val button32 = findViewById<View>(R.id.cd31) as Button
        val button33 = findViewById<View>(R.id.cd32) as Button
        val button34 = findViewById<View>(R.id.cd33) as Button
        val button35 = findViewById<View>(R.id.cd34) as Button
        val button36 = findViewById<View>(R.id.cd35) as Button
        val button37 = findViewById<View>(R.id.cd36) as Button
        val button38 = findViewById<View>(R.id.cd37) as Button
        val button39 = findViewById<View>(R.id.cd38) as Button
        val button40 = findViewById<View>(R.id.cd39) as Button
        val button41 = findViewById<View>(R.id.cd40) as Button
        val button42 = findViewById<View>(R.id.cd41) as Button
        val button43 = findViewById<View>(R.id.cd42) as Button
        val button44 = findViewById<View>(R.id.cd43) as Button
        val button45 = findViewById<View>(R.id.cd44) as Button
        val button46 = findViewById<View>(R.id.cd45) as Button
        val button47 = findViewById<View>(R.id.cd46) as Button

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
                        button47.text.toString()
        ).forEach {
            println(it)
        }

        button1.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cdk")
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd1")
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd2")
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd3")
            startActivity(intent)
        }
        button5.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd4")
            startActivity(intent)
        }
        button6.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd5")
            startActivity(intent)
        }
        button7.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd6")
            startActivity(intent)
        }
        button8.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd7")
            startActivity(intent)
        }
        button9.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd8")
            startActivity(intent)
        }
        button10.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd9")
            startActivity(intent)
        }
        button11.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd10")
            startActivity(intent)
        }
        button12.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd11")
            startActivity(intent)
        }
        button13.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd12")
            startActivity(intent)
        }
        button14.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd13")
            startActivity(intent)
        }
        button15.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd14")
            startActivity(intent)
        }
        button16.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd15")
            startActivity(intent)
        }
        button17.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd16")
            startActivity(intent)
        }
        button18.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd17")
            startActivity(intent)
        }
        button19.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd18")
            startActivity(intent)
        }
        button20.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd19")
            startActivity(intent)
        }
        button21.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd20")
            startActivity(intent)
        }
        button22.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd21")
            startActivity(intent)
        }
        button23.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd22")
            startActivity(intent)
        }
        button24.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd23")
            startActivity(intent)
        }
        button25.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd24")
            startActivity(intent)
        }
        button26.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd25")
            startActivity(intent)
        }
        button27.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd26")
            startActivity(intent)
        }
        button28.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd27")
            startActivity(intent)
        }
        button29.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd28")
            startActivity(intent)
        }
        button30.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd29")
            startActivity(intent)
        }
        button31.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd30")
            startActivity(intent)
        }
        button32.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd31")
            startActivity(intent)
        }
        button33.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd32")
            startActivity(intent)
        }
        button34.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd33")
            startActivity(intent)
        }
        button35.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd34")
            startActivity(intent)
        }
        button36.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd35")
            startActivity(intent)
        }
        button37.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd36")
            startActivity(intent)
        }
        button38.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd37")
            startActivity(intent)
        }
        button39.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd38")
            startActivity(intent)
        }
        button40.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd39")
            startActivity(intent)
        }
        button41.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd40")
            startActivity(intent)
        }
        button42.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd41")
            startActivity(intent)
        }
        button43.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd42")
            startActivity(intent)
        }
        button44.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd43")
            startActivity(intent)
        }
        button45.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd44")
            startActivity(intent)
        }
        button46.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd45")
            startActivity(intent)
        }
        button47.setOnClickListener {
            val intent = Intent(this@chandkiran, Data::class.java).putExtra("id", "cd46")
            startActivity(intent)
        }
    }
}