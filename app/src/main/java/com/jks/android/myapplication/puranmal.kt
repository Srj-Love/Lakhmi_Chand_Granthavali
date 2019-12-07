package com.jks.android.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class puranmal : AppCompatActivity() {
    private val button: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puranmal)
        val button1 = findViewById<View>(R.id.ppk) as Button
        val button2 = findViewById<View>(R.id.pp1) as Button
        val button3 = findViewById<View>(R.id.pp2) as Button
        val button4 = findViewById<View>(R.id.pp3) as Button
        val button5 = findViewById<View>(R.id.pp4) as Button
        val button6 = findViewById<View>(R.id.pp5) as Button
        val button7 = findViewById<View>(R.id.pp6) as Button
        val button8 = findViewById<View>(R.id.pp7) as Button
        val button9 = findViewById<View>(R.id.pp8) as Button
        val button10 = findViewById<View>(R.id.pp9) as Button
        val button11 = findViewById<View>(R.id.pp10) as Button
        val button12 = findViewById<View>(R.id.pp11) as Button
        val button13 = findViewById<View>(R.id.pp12) as Button
        val button14 = findViewById<View>(R.id.pp13) as Button
        val button15 = findViewById<View>(R.id.pp14) as Button
        val button16 = findViewById<View>(R.id.pp15) as Button
        val button17 = findViewById<View>(R.id.pp16) as Button
        val button18 = findViewById<View>(R.id.pp17) as Button
        val button19 = findViewById<View>(R.id.pp18) as Button
        val button20 = findViewById<View>(R.id.pp19) as Button
        val button21 = findViewById<View>(R.id.pp20) as Button
        val button22 = findViewById<View>(R.id.pp21) as Button
        val button23 = findViewById<View>(R.id.pp22) as Button
        val button24 = findViewById<View>(R.id.pp23) as Button
        val button25 = findViewById<View>(R.id.pp24) as Button
        val button26 = findViewById<View>(R.id.pp25) as Button
        val button27 = findViewById<View>(R.id.pp26) as Button
        val button28 = findViewById<View>(R.id.pp27) as Button
        val button29 = findViewById<View>(R.id.pp28) as Button
        val button30 = findViewById<View>(R.id.pp29) as Button
        val button31 = findViewById<View>(R.id.pp30) as Button
        val button32 = findViewById<View>(R.id.pp31) as Button
        val button33 = findViewById<View>(R.id.pp32) as Button
        val button34 = findViewById<View>(R.id.pp33) as Button
        val button35 = findViewById<View>(R.id.pp34) as Button
        val button36 = findViewById<View>(R.id.pp35) as Button
        val button37 = findViewById<View>(R.id.pp36) as Button
        val button38 = findViewById<View>(R.id.pp37) as Button
        val button39 = findViewById<View>(R.id.pp38) as Button
        val button40 = findViewById<View>(R.id.pp39) as Button
        val button41 = findViewById<View>(R.id.pp40) as Button
        val button42 = findViewById<View>(R.id.pp41) as Button
        val button43 = findViewById<View>(R.id.pp42) as Button
        val button44 = findViewById<View>(R.id.pp43) as Button
        val button45 = findViewById<View>(R.id.pp44) as Button
        val button46 = findViewById<View>(R.id.pp45) as Button
        val button47 = findViewById<View>(R.id.pp46) as Button
        val button48 = findViewById<View>(R.id.pp47) as Button
        val button49 = findViewById<View>(R.id.pp48) as Button
        val button50 = findViewById<View>(R.id.pp49) as Button
        val button51 = findViewById<View>(R.id.pp50) as Button
        val button52 = findViewById<View>(R.id.pp51) as Button
        val button53 = findViewById<View>(R.id.pp52) as Button
        val button54 = findViewById<View>(R.id.pp53) as Button
        val button55 = findViewById<View>(R.id.pp54) as Button
        val button56 = findViewById<View>(R.id.pp55) as Button
        val button57 = findViewById<View>(R.id.pp56) as Button
        val button58 = findViewById<View>(R.id.pp57) as Button
        val button59 = findViewById<View>(R.id.pp58) as Button
        val button60 = findViewById<View>(R.id.pp59) as Button
        val button61 = findViewById<View>(R.id.pp60) as Button
        val button62 = findViewById<View>(R.id.pp61) as Button


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
                        button51.text.toString(),
                        button52.text.toString(),
                        button53.text.toString(),
                        button54.text.toString(),
                        button55.text.toString(),
                        button56.text.toString(),
                        button57.text.toString(),
                        button58.text.toString(),
                        button59.text.toString(),
                        button60.text.toString(),
                        button61.text.toString(),
                        button62.text.toString()
        ).forEach {
            println(it)
        }


        button1.setOnClickListener {
            val intent = Intent(this@puranmal, ppk::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this@puranmal, pp1::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this@puranmal, pp2::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this@puranmal, pp3::class.java)
            startActivity(intent)
        }
        button5.setOnClickListener {
            val intent = Intent(this@puranmal, pp4::class.java)
            startActivity(intent)
        }
        button6.setOnClickListener {
            val intent = Intent(this@puranmal, pp5::class.java)
            startActivity(intent)
        }
        button7.setOnClickListener {
            val intent = Intent(this@puranmal, pp6::class.java)
            startActivity(intent)
        }
        button8.setOnClickListener {
            val intent = Intent(this@puranmal, pp7::class.java)
            startActivity(intent)
        }
        button9.setOnClickListener {
            val intent = Intent(this@puranmal, pp8::class.java)
            startActivity(intent)
        }
        button10.setOnClickListener {
            val intent = Intent(this@puranmal, pp9::class.java)
            startActivity(intent)
        }
        button11.setOnClickListener {
            val intent = Intent(this@puranmal, pp10::class.java)
            startActivity(intent)
        }
        button12.setOnClickListener {
            val intent = Intent(this@puranmal, pp11::class.java)
            startActivity(intent)
        }
        button13.setOnClickListener {
            val intent = Intent(this@puranmal, pp12::class.java)
            startActivity(intent)
        }
        button14.setOnClickListener {
            val intent = Intent(this@puranmal, pp13::class.java)
            startActivity(intent)
        }
        button15.setOnClickListener {
            val intent = Intent(this@puranmal, pp14::class.java)
            startActivity(intent)
        }
        button16.setOnClickListener {
            val intent = Intent(this@puranmal, pp15::class.java)
            startActivity(intent)
        }
        button17.setOnClickListener {
            val intent = Intent(this@puranmal, pp16::class.java)
            startActivity(intent)
        }
        button18.setOnClickListener {
            val intent = Intent(this@puranmal, pp17::class.java)
            startActivity(intent)
        }
        button19.setOnClickListener {
            val intent = Intent(this@puranmal, pp18::class.java)
            startActivity(intent)
        }
        button20.setOnClickListener {
            val intent = Intent(this@puranmal, pp19::class.java)
            startActivity(intent)
        }
        button21.setOnClickListener {
            val intent = Intent(this@puranmal, pp20::class.java)
            startActivity(intent)
        }
        button22.setOnClickListener {
            val intent = Intent(this@puranmal, pp21::class.java)
            startActivity(intent)
        }
        button23.setOnClickListener {
            val intent = Intent(this@puranmal, pp22::class.java)
            startActivity(intent)
        }
        button24.setOnClickListener {
            val intent = Intent(this@puranmal, pp23::class.java)
            startActivity(intent)
        }
        button25.setOnClickListener {
            val intent = Intent(this@puranmal, pp24::class.java)
            startActivity(intent)
        }
        button26.setOnClickListener {
            val intent = Intent(this@puranmal, pp25::class.java)
            startActivity(intent)
        }
        button27.setOnClickListener {
            val intent = Intent(this@puranmal, pp26::class.java)
            startActivity(intent)
        }
        button28.setOnClickListener {
            val intent = Intent(this@puranmal, pp27::class.java)
            startActivity(intent)
        }
        button29.setOnClickListener {
            val intent = Intent(this@puranmal, pp28::class.java)
            startActivity(intent)
        }
        button30.setOnClickListener {
            val intent = Intent(this@puranmal, pp29::class.java)
            startActivity(intent)
        }
        button31.setOnClickListener {
            val intent = Intent(this@puranmal, pp30::class.java)
            startActivity(intent)
        }
        button32.setOnClickListener {
            val intent = Intent(this@puranmal, pp31::class.java)
            startActivity(intent)
        }
        button33.setOnClickListener {
            val intent = Intent(this@puranmal, pp32::class.java)
            startActivity(intent)
        }
        button34.setOnClickListener {
            val intent = Intent(this@puranmal, pp33::class.java)
            startActivity(intent)
        }
        button35.setOnClickListener {
            val intent = Intent(this@puranmal, pp34::class.java)
            startActivity(intent)
        }
        button36.setOnClickListener {
            val intent = Intent(this@puranmal, pp35::class.java)
            startActivity(intent)
        }
        button37.setOnClickListener {
            val intent = Intent(this@puranmal, pp36::class.java)
            startActivity(intent)
        }
        button38.setOnClickListener {
            val intent = Intent(this@puranmal, pp37::class.java)
            startActivity(intent)
        }
        button39.setOnClickListener {
            val intent = Intent(this@puranmal, pp38::class.java)
            startActivity(intent)
        }
        button40.setOnClickListener {
            val intent = Intent(this@puranmal, pp39::class.java)
            startActivity(intent)
        }
        button41.setOnClickListener {
            val intent = Intent(this@puranmal, pp40::class.java)
            startActivity(intent)
        }
        button42.setOnClickListener {
            val intent = Intent(this@puranmal, pp41::class.java)
            startActivity(intent)
        }
        button43.setOnClickListener {
            val intent = Intent(this@puranmal, pp42::class.java)
            startActivity(intent)
        }
        button44.setOnClickListener {
            val intent = Intent(this@puranmal, pp43::class.java)
            startActivity(intent)
        }
        button45.setOnClickListener {
            val intent = Intent(this@puranmal, pp44::class.java)
            startActivity(intent)
        }
        button46.setOnClickListener {
            val intent = Intent(this@puranmal, pp45::class.java)
            startActivity(intent)
        }
        button47.setOnClickListener {
            val intent = Intent(this@puranmal, pp46::class.java)
            startActivity(intent)
        }
        button48.setOnClickListener {
            val intent = Intent(this@puranmal, pp47::class.java)
            startActivity(intent)
        }
        button49.setOnClickListener {
            val intent = Intent(this@puranmal, pp48::class.java)
            startActivity(intent)
        }
        button50.setOnClickListener {
            val intent = Intent(this@puranmal, pp49::class.java)
            startActivity(intent)
        }
        button51.setOnClickListener {
            val intent = Intent(this@puranmal, pp50::class.java)
            startActivity(intent)
        }
        button52.setOnClickListener {
            val intent = Intent(this@puranmal, pp51::class.java)
            startActivity(intent)
        }
        button53.setOnClickListener {
            val intent = Intent(this@puranmal, pp52::class.java)
            startActivity(intent)
        }
        button54.setOnClickListener {
            val intent = Intent(this@puranmal, pp53::class.java)
            startActivity(intent)
        }
        button55.setOnClickListener {
            val intent = Intent(this@puranmal, pp54::class.java)
            startActivity(intent)
        }
        button56.setOnClickListener {
            val intent = Intent(this@puranmal, pp55::class.java)
            startActivity(intent)
        }
        button57.setOnClickListener {
            val intent = Intent(this@puranmal, pp56::class.java)
            startActivity(intent)
        }
        button58.setOnClickListener {
            val intent = Intent(this@puranmal, pp57::class.java)
            startActivity(intent)
        }
        button59.setOnClickListener {
            val intent = Intent(this@puranmal, pp58::class.java)
            startActivity(intent)
        }
        button60.setOnClickListener {
            val intent = Intent(this@puranmal, P59::class.java)
            startActivity(intent)
        }
        button61.setOnClickListener {
            val intent = Intent(this@puranmal, P34::class.java)
            startActivity(intent)
        }
        button62.setOnClickListener {
            val intent = Intent(this@puranmal, P60::class.java)
            startActivity(intent)
        }
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}