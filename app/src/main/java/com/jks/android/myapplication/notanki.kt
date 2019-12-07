package com.jks.android.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class notanki : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notanki)
        val button1 = findViewById<View>(R.id.ntk) as Button
        val button2 = findViewById<View>(R.id.nt1) as Button
        val button3 = findViewById<View>(R.id.nt2) as Button
        val button4 = findViewById<View>(R.id.nt3) as Button
        val button5 = findViewById<View>(R.id.nt4) as Button
        val button6 = findViewById<View>(R.id.nt5) as Button
        val button7 = findViewById<View>(R.id.nt6) as Button
        val button8 = findViewById<View>(R.id.nt7) as Button
        val button9 = findViewById<View>(R.id.nt8) as Button
        val button10 = findViewById<View>(R.id.nt9) as Button
        val button11 = findViewById<View>(R.id.nt10) as Button
        val button12 = findViewById<View>(R.id.nt11) as Button
        val button13 = findViewById<View>(R.id.nt12) as Button
        val button14 = findViewById<View>(R.id.nt13) as Button
        val button15 = findViewById<View>(R.id.nt14) as Button
        val button16 = findViewById<View>(R.id.nt15) as Button
        val button17 = findViewById<View>(R.id.nt16) as Button
        val button18 = findViewById<View>(R.id.nt17) as Button
        val button19 = findViewById<View>(R.id.nt18) as Button
        val button20 = findViewById<View>(R.id.nt19) as Button
        val button21 = findViewById<View>(R.id.nt20) as Button
        val button22 = findViewById<View>(R.id.nt21) as Button
        val button23 = findViewById<View>(R.id.nt22) as Button
        val button24 = findViewById<View>(R.id.nt23) as Button
        val button25 = findViewById<View>(R.id.nt24) as Button
        val button26 = findViewById<View>(R.id.nt25) as Button
        val button27 = findViewById<View>(R.id.nt26) as Button
        val button28 = findViewById<View>(R.id.nt27) as Button
        val button29 = findViewById<View>(R.id.nt28) as Button
        val button30 = findViewById<View>(R.id.nt29) as Button
        val button31 = findViewById<View>(R.id.nt30) as Button
        val button32 = findViewById<View>(R.id.nt31) as Button
        val button33 = findViewById<View>(R.id.nt32) as Button
        val button34 = findViewById<View>(R.id.nt33) as Button
        val button35 = findViewById<View>(R.id.nt34) as Button
        val button36 = findViewById<View>(R.id.nt35) as Button
        val button37 = findViewById<View>(R.id.nt36) as Button
        val button38 = findViewById<View>(R.id.nt37) as Button
        val button39 = findViewById<View>(R.id.nt38) as Button
        val button40 = findViewById<View>(R.id.nt39) as Button
        val button41 = findViewById<View>(R.id.nt40) as Button
        val button42 = findViewById<View>(R.id.nt41) as Button
        val button43 = findViewById<View>(R.id.nt42) as Button
        val button44 = findViewById<View>(R.id.nt43) as Button
        val button45 = findViewById<View>(R.id.nt44) as Button
        val button46 = findViewById<View>(R.id.nt45) as Button
        val button47 = findViewById<View>(R.id.nt46) as Button
        val button48 = findViewById<View>(R.id.nt47) as Button
        val button49 = findViewById<View>(R.id.nt48) as Button
        val button50 = findViewById<View>(R.id.nt49) as Button
        val button51 = findViewById<View>(R.id.nt50) as Button
        val button52 = findViewById<View>(R.id.nt51) as Button
        val button53 = findViewById<View>(R.id.nt52) as Button
        val button54 = findViewById<View>(R.id.nt53) as Button
        val button55 = findViewById<View>(R.id.nt54) as Button
        val button56 = findViewById<View>(R.id.nt55) as Button
        val button57 = findViewById<View>(R.id.nt56) as Button
        val button58 = findViewById<View>(R.id.nt57) as Button
        val button59 = findViewById<View>(R.id.nt58) as Button
        val button60 = findViewById<View>(R.id.nt59) as Button
        val button61 = findViewById<View>(R.id.nt60) as Button
        val button62 = findViewById<View>(R.id.nt61) as Button
        val button63 = findViewById<View>(R.id.nt62) as Button
        val button64 = findViewById<View>(R.id.nt63) as Button
        val button65 = findViewById<View>(R.id.nt64) as Button
        val button66 = findViewById<View>(R.id.nt65) as Button
        val button67 = findViewById<View>(R.id.nt66) as Button
        val button68 = findViewById<View>(R.id.nt67) as Button
        val button69 = findViewById<View>(R.id.nt68) as Button
        val button70 = findViewById<View>(R.id.nt69) as Button

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
                        button62.text.toString(),
                        button63.text.toString(),
                        button64.text.toString(),
                        button65.text.toString(),
                        button66.text.toString(),
                        button67.text.toString(),
                        button68.text.toString(),
                        button69.text.toString(),
                        button70.text.toString()
        ).forEach {
            println(it)
        }

        button1.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "ntk")
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt1")
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt2")
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt3")
            startActivity(intent)
        }
        button5.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt4")
            startActivity(intent)
        }
        button6.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt5")
            startActivity(intent)
        }
        button7.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt6")
            startActivity(intent)
        }
        button8.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt7")
            startActivity(intent)
        }
        button9.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt8")
            startActivity(intent)
        }
        button10.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt9")
            startActivity(intent)
        }
        button11.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt10")
            startActivity(intent)
        }
        button12.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt11")
            startActivity(intent)
        }
        button13.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt12")
            startActivity(intent)
        }
        button14.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt13")
            startActivity(intent)
        }
        button15.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt14")
            startActivity(intent)
        }
        button16.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt15")
            startActivity(intent)
        }
        button17.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt16")
            startActivity(intent)
        }
        button18.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt17")
            startActivity(intent)
        }
        button19.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt18")
            startActivity(intent)
        }
        button20.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt19")
            startActivity(intent)
        }
        button21.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt20")
            startActivity(intent)
        }
        button22.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt21")
            startActivity(intent)
        }
        button23.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt22")
            startActivity(intent)
        }
        button24.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt23")
            startActivity(intent)
        }
        button25.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt24")
            startActivity(intent)
        }
        button26.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt25")
            startActivity(intent)
        }
        button27.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt26")
            startActivity(intent)
        }
        button28.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt27")
            startActivity(intent)
        }
        button29.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt28")
            startActivity(intent)
        }
        button30.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt29")
            startActivity(intent)
        }
        button31.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt30")
            startActivity(intent)
        }
        button32.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt31")
            startActivity(intent)
        }
        button33.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt32")
            startActivity(intent)
        }
        button34.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt33")
            startActivity(intent)
        }
        button35.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt34")
            startActivity(intent)
        }
        button36.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt35")
            startActivity(intent)
        }
        button37.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt36")
            startActivity(intent)
        }
        button38.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt37")
            startActivity(intent)
        }
        button39.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt38")
            startActivity(intent)
        }
        button40.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt39")
            startActivity(intent)
        }
        button41.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt40")
            startActivity(intent)
        }
        button42.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt41")
            startActivity(intent)
        }
        button43.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt42")
            startActivity(intent)
        }
        button44.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt43")
            startActivity(intent)
        }
        button45.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt44")
            startActivity(intent)
        }
        button46.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt45")
            startActivity(intent)
        }
        button47.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt46")
            startActivity(intent)
        }
        button48.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt47")
            startActivity(intent)
        }
        button49.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt48")
            startActivity(intent)
        }
        button50.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt49")
            startActivity(intent)
        }
        button51.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt50")
            startActivity(intent)
        }
        button52.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt51")
            startActivity(intent)
        }
        button53.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt52")
            startActivity(intent)
        }
        button54.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt53")
            startActivity(intent)
        }
        button55.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt54")
            startActivity(intent)
        }
        button56.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt55")
            startActivity(intent)
        }
        button57.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt56")
            startActivity(intent)
        }
        button58.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt57")
            startActivity(intent)
        }
        button59.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt58")
            startActivity(intent)
        }
        button60.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt59")
            startActivity(intent)
        }
        button61.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt60")
            startActivity(intent)
        }
        button62.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt61")
            startActivity(intent)
        }
        button63.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt62")
            startActivity(intent)
        }
        button64.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt63")
            startActivity(intent)
        }
        button65.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt64")
            startActivity(intent)
        }
        button66.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt65")
            startActivity(intent)
        }
        button67.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt66")
            startActivity(intent)
        }
        button68.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt67")
            startActivity(intent)
        }
        button69.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt68")
            startActivity(intent)
        }
        button70.setOnClickListener {
            val intent = Intent(this@notanki, Data::class.java).putExtra("id", "nt69")
            startActivity(intent)
        }
    }
}