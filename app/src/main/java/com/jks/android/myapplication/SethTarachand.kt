package com.jks.android.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SethTarachand : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seth_tarachand)
        val button1 = findViewById<View>(R.id.stk) as Button
        val button2 = findViewById<View>(R.id.st1) as Button
        val button3 = findViewById<View>(R.id.st2) as Button
        val button4 = findViewById<View>(R.id.st3) as Button
        val button5 = findViewById<View>(R.id.st4) as Button
        val button6 = findViewById<View>(R.id.st5) as Button
        val button7 = findViewById<View>(R.id.st6) as Button
        val button8 = findViewById<View>(R.id.st7) as Button
        val button9 = findViewById<View>(R.id.st8) as Button
        val button10 = findViewById<View>(R.id.st9) as Button
        val button11 = findViewById<View>(R.id.st10) as Button
        val button12 = findViewById<View>(R.id.st11) as Button
        val button13 = findViewById<View>(R.id.st12) as Button
        val button14 = findViewById<View>(R.id.st13) as Button
        val button15 = findViewById<View>(R.id.st14) as Button
        val button16 = findViewById<View>(R.id.st15) as Button
        val button17 = findViewById<View>(R.id.st16) as Button
        val button18 = findViewById<View>(R.id.st17) as Button
        val button19 = findViewById<View>(R.id.st18) as Button
        val button20 = findViewById<View>(R.id.st19) as Button
        val button21 = findViewById<View>(R.id.st20) as Button
        val button22 = findViewById<View>(R.id.st21) as Button
        val button23 = findViewById<View>(R.id.st22) as Button
        val button24 = findViewById<View>(R.id.st23) as Button
        val button25 = findViewById<View>(R.id.st24) as Button
        val button26 = findViewById<View>(R.id.st25) as Button
        val button27 = findViewById<View>(R.id.st26) as Button

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
                button27.text.toString()
        ).forEach {
            println(it)
        }




        button1.setOnClickListener {
            val intent = Intent(this@SethTarachand, Data::class.java).putExtra("id", "stk")
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this@SethTarachand, Data::class.java).putExtra("id", "st1")
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this@SethTarachand, Data::class.java).putExtra("id", "st2")
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this@SethTarachand, Data::class.java).putExtra("id", "st3")
            startActivity(intent)
        }
        button5.setOnClickListener {
            val intent = Intent(this@SethTarachand, Data::class.java).putExtra("id", "st4")
            startActivity(intent)
        }
        button6.setOnClickListener {
            val intent = Intent(this@SethTarachand, Data::class.java).putExtra("id", "st5")
            startActivity(intent)
        }
        button7.setOnClickListener {
            val intent = Intent(this@SethTarachand, Data::class.java).putExtra("id", "st6")
            startActivity(intent)
        }
        button8.setOnClickListener {
            val intent = Intent(this@SethTarachand, Data::class.java).putExtra("id", "st7")
            startActivity(intent)
        }
        button9.setOnClickListener {
            val intent = Intent(this@SethTarachand, Data::class.java).putExtra("id", "st8")
            startActivity(intent)
        }
        button10.setOnClickListener {
            val intent = Intent(this@SethTarachand, Data::class.java).putExtra("id", "st9")
            startActivity(intent)
        }
        button11.setOnClickListener {
            val intent = Intent(this@SethTarachand, Data::class.java).putExtra("id", "st10")
            startActivity(intent)
        }
        button12.setOnClickListener {
            val intent = Intent(this@SethTarachand, Data::class.java).putExtra("id", "st11")
            startActivity(intent)
        }
        button13.setOnClickListener {
            val intent = Intent(this@SethTarachand, Data::class.java).putExtra("id", "st12")
            startActivity(intent)
        }
        button14.setOnClickListener {
            val intent = Intent(this@SethTarachand, Data::class.java).putExtra("id", "st13")
            startActivity(intent)
        }
        button15.setOnClickListener {
            val intent = Intent(this@SethTarachand, Data::class.java).putExtra("id", "st14")
            startActivity(intent)
        }
        button16.setOnClickListener {
            val intent = Intent(this@SethTarachand, Data::class.java).putExtra("id", "st15")
            startActivity(intent)
        }
        button17.setOnClickListener {
            val intent = Intent(this@SethTarachand, Data::class.java).putExtra("id", "st16")
            startActivity(intent)
        }
        button18.setOnClickListener {
            val intent = Intent(this@SethTarachand, Data::class.java).putExtra("id", "st17")
            startActivity(intent)
        }
        button19.setOnClickListener {
            val intent = Intent(this@SethTarachand, Data::class.java).putExtra("id", "st18")
            startActivity(intent)
        }
        button20.setOnClickListener {
            val intent = Intent(this@SethTarachand, Data::class.java).putExtra("id", "st19")
            startActivity(intent)
        }
        button21.setOnClickListener {
            val intent = Intent(this@SethTarachand, Data::class.java).putExtra("id", "st20")
            startActivity(intent)
        }
        button22.setOnClickListener {
            val intent = Intent(this@SethTarachand, Data::class.java).putExtra("id", "st21")
            startActivity(intent)
        }
        button23.setOnClickListener {
            val intent = Intent(this@SethTarachand, Data::class.java).putExtra("id", "st22")
            startActivity(intent)
        }
        button24.setOnClickListener {
            val intent = Intent(this@SethTarachand, Data::class.java).putExtra("id", "st23")
            startActivity(intent)
        }
        button25.setOnClickListener {
            val intent = Intent(this@SethTarachand, Data::class.java).putExtra("id", "st24")
            startActivity(intent)
        }
        button26.setOnClickListener {
            val intent = Intent(this@SethTarachand, Data::class.java).putExtra("id", "st25")
            startActivity(intent)
        }
        button27.setOnClickListener {
            val intent = Intent(this@SethTarachand, Data::class.java).putExtra("id", "st26")
            startActivity(intent)
        }
    }
}