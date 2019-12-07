package com.jks.android.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class chirparv : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chirparv)
        val button1 = findViewById<View>(R.id.cpk) as Button
        val button2 = findViewById<View>(R.id.cp1) as Button
        val button3 = findViewById<View>(R.id.cp2) as Button
        val button4 = findViewById<View>(R.id.cp3) as Button
        val button5 = findViewById<View>(R.id.cp4) as Button
        val button6 = findViewById<View>(R.id.cp5) as Button
        val button7 = findViewById<View>(R.id.cp6) as Button
        val button8 = findViewById<View>(R.id.cp7) as Button
        val button9 = findViewById<View>(R.id.cp8) as Button
        val button10 = findViewById<View>(R.id.cp9) as Button
        val button11 = findViewById<View>(R.id.cp10) as Button
        val button12 = findViewById<View>(R.id.cp11) as Button
        val button13 = findViewById<View>(R.id.cp12) as Button
        val button14 = findViewById<View>(R.id.cp13) as Button
        val button15 = findViewById<View>(R.id.cp14) as Button
        val button16 = findViewById<View>(R.id.cp15) as Button
        val button17 = findViewById<View>(R.id.cp16) as Button
        val button18 = findViewById<View>(R.id.cp17) as Button
        val button19 = findViewById<View>(R.id.cp18) as Button
        val button20 = findViewById<View>(R.id.cp19) as Button
        val button21 = findViewById<View>(R.id.cp20) as Button
        val button22 = findViewById<View>(R.id.cp21) as Button
        val button23 = findViewById<View>(R.id.cp22) as Button
        val button24 = findViewById<View>(R.id.cp23) as Button
        val button25 = findViewById<View>(R.id.cp24) as Button
        val button26 = findViewById<View>(R.id.cp25) as Button
        val button27 = findViewById<View>(R.id.cp26) as Button
        val button28 = findViewById<View>(R.id.cp27) as Button
        val button29 = findViewById<View>(R.id.cp28) as Button
        val button30 = findViewById<View>(R.id.cp29) as Button
        val button31 = findViewById<View>(R.id.cp30) as Button
        val button32 = findViewById<View>(R.id.cp31) as Button
        val button33 = findViewById<View>(R.id.cp32) as Button
        val button34 = findViewById<View>(R.id.cp33) as Button
        val button35 = findViewById<View>(R.id.cp34) as Button
        val button36 = findViewById<View>(R.id.cp35) as Button
        val button37 = findViewById<View>(R.id.cp36) as Button
        val button38 = findViewById<View>(R.id.cp37) as Button
        val button39 = findViewById<View>(R.id.cp38) as Button
        val button40 = findViewById<View>(R.id.cp39) as Button
        val button41 = findViewById<View>(R.id.cp40) as Button

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
                        button41.text.toString()
        ).forEach {
            println(it)
        }

        button1.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cpk")
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp1")
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp2")
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp3")
            startActivity(intent)
        }
        button5.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp4")
            startActivity(intent)
        }
        button6.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp5")
            startActivity(intent)
        }
        button7.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp6")
            startActivity(intent)
        }
        button8.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp7")
            startActivity(intent)
        }
        button9.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp8")
            startActivity(intent)
        }
        button10.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp9")
            startActivity(intent)
        }
        button11.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp10")
            startActivity(intent)
        }
        button12.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp11")
            startActivity(intent)
        }
        button13.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp12")
            startActivity(intent)
        }
        button14.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp13")
            startActivity(intent)
        }
        button15.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp14")
            startActivity(intent)
        }
        button16.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp15")
            startActivity(intent)
        }
        button17.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp16")
            startActivity(intent)
        }
        button18.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp17")
            startActivity(intent)
        }
        button19.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp18")
            startActivity(intent)
        }
        button20.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp19")
            startActivity(intent)
        }
        button21.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp20")
            startActivity(intent)
        }
        button22.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp21")
            startActivity(intent)
        }
        button23.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp22")
            startActivity(intent)
        }
        button24.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp23")
            startActivity(intent)
        }
        button25.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp24")
            startActivity(intent)
        }
        button26.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp25")
            startActivity(intent)
        }
        button27.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp26")
            startActivity(intent)
        }
        button28.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp27")
            startActivity(intent)
        }
        button29.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp28")
            startActivity(intent)
        }
        button30.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp29")
            startActivity(intent)
        }
        button31.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp30")
            startActivity(intent)
        }
        button32.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp31")
            startActivity(intent)
        }
        button33.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp32")
            startActivity(intent)
        }
        button34.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp33")
            startActivity(intent)
        }
        button35.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp34")
            startActivity(intent)
        }
        button36.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp35")
            startActivity(intent)
        }
        button37.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp36")
            startActivity(intent)
        }
        button38.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp37")
            startActivity(intent)
        }
        button39.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp38")
            startActivity(intent)
        }
        button40.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp39")
            startActivity(intent)
        }
        button41.setOnClickListener {
            val intent = Intent(this@chirparv, Data::class.java).putExtra("id", "cp40")
            startActivity(intent)
        }
    }
}