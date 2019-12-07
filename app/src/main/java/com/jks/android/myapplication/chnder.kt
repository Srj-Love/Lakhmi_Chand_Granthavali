package com.jks.android.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class chnder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chnder)
        val button28 = findViewById<View>(R.id.st27) as Button
        val button29 = findViewById<View>(R.id.st28) as Button
        val button30 = findViewById<View>(R.id.st29) as Button
        val button31 = findViewById<View>(R.id.st30) as Button
        val button32 = findViewById<View>(R.id.st31) as Button
        val button33 = findViewById<View>(R.id.st32) as Button
        val button34 = findViewById<View>(R.id.st33) as Button
        val button35 = findViewById<View>(R.id.st34) as Button
        val button36 = findViewById<View>(R.id.st35) as Button
        val button37 = findViewById<View>(R.id.st36) as Button
        val button38 = findViewById<View>(R.id.st37) as Button
        val button39 = findViewById<View>(R.id.st38) as Button
        val button40 = findViewById<View>(R.id.st39) as Button
        val button41 = findViewById<View>(R.id.st40) as Button
        val button42 = findViewById<View>(R.id.st41) as Button
        val button43 = findViewById<View>(R.id.st42) as Button
        val button44 = findViewById<View>(R.id.st43) as Button
        val button45 = findViewById<View>(R.id.st44) as Button
        val button46 = findViewById<View>(R.id.st45) as Button
        val button47 = findViewById<View>(R.id.st46) as Button
        val button48 = findViewById<View>(R.id.st47) as Button
        val button49 = findViewById<View>(R.id.st48) as Button
        val button50 = findViewById<View>(R.id.st49) as Button
        val button51 = findViewById<View>(R.id.st50) as Button
        val button52 = findViewById<View>(R.id.st51) as Button
        val button53 = findViewById<View>(R.id.st52) as Button
        val button54 = findViewById<View>(R.id.st53) as Button
        val button55 = findViewById<View>(R.id.st54) as Button
        val button56 = findViewById<View>(R.id.st55) as Button
        val button57 = findViewById<View>(R.id.st56) as Button
        val button58 = findViewById<View>(R.id.st57) as Button
        val button59 = findViewById<View>(R.id.st58) as Button
        val button60 = findViewById<View>(R.id.st59) as Button
        val button61 = findViewById<View>(R.id.st60) as Button
        val button62 = findViewById<View>(R.id.st61) as Button
        val button63 = findViewById<View>(R.id.st62) as Button
        val button64 = findViewById<View>(R.id.st63) as Button
        val button65 = findViewById<View>(R.id.st64) as Button
        val button66 = findViewById<View>(R.id.st65) as Button
        val button67 = findViewById<View>(R.id.st66) as Button
        val button68 = findViewById<View>(R.id.st67) as Button
        val button69 = findViewById<View>(R.id.st68) as Button
        val button70 = findViewById<View>(R.id.st69) as Button
        val button71 = findViewById<View>(R.id.st70) as Button
        val button72 = findViewById<View>(R.id.st71) as Button
        val button73 = findViewById<View>(R.id.st72) as Button
        val button74 = findViewById<View>(R.id.st73) as Button
        val button75 = findViewById<View>(R.id.st74) as Button
        val button76 = findViewById<View>(R.id.st75) as Button
        val button77 = findViewById<View>(R.id.st76) as Button
        val button78 = findViewById<View>(R.id.st77) as Button
        val button79 = findViewById<View>(R.id.st78) as Button
        val button80 = findViewById<View>(R.id.st79) as Button
        val button81 = findViewById<View>(R.id.st80) as Button
        val button82 = findViewById<View>(R.id.st81) as Button
        val button83 = findViewById<View>(R.id.st82) as Button
        val button84 = findViewById<View>(R.id.st83) as Button
        val button85 = findViewById<View>(R.id.st84) as Button
        val button86 = findViewById<View>(R.id.st85) as Button
        val button87 = findViewById<View>(R.id.st86) as Button
        val button88 = findViewById<View>(R.id.st87) as Button
        val button89 = findViewById<View>(R.id.st88) as Button
        val button90 = findViewById<View>(R.id.st89) as Button
        val button91 = findViewById<View>(R.id.st90) as Button
        val button92 = findViewById<View>(R.id.st91) as Button
        val button93 = findViewById<View>(R.id.st92) as Button
        val button94 = findViewById<View>(R.id.st93) as Button
        val button95 = findViewById<View>(R.id.st94) as Button
        val button96 = findViewById<View>(R.id.st95) as Button
        val button97 = findViewById<View>(R.id.st96) as Button
        val button98 = findViewById<View>(R.id.st97) as Button
        val button99 = findViewById<View>(R.id.st98) as Button
        val button100 = findViewById<View>(R.id.st99) as Button
        val button101 = findViewById<View>(R.id.st100) as Button
        val button102 = findViewById<View>(R.id.st101) as Button

        /*arrayListOf(
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
                button70.text.toString(),
                button71.text.toString(),
                button72.text.toString(),
                button73.text.toString(),
                button74.text.toString(),
                button75.text.toString(),
                button76.text.toString(),
                button77.text.toString(),
                button78.text.toString(),
                button79.text.toString(),
                button80.text.toString(),
                button81.text.toString(),
                button82.text.toString(),
                button83.text.toString(),
                button84.text.toString(),
                button85.text.toString(),
                button86.text.toString(),
                button87.text.toString(),
                button88.text.toString(),
                button89.text.toString(),
                button90.text.toString(),
                button91.text.toString(),
                button92.text.toString(),
                button93.text.toString(),
                button94.text.toString(),
                button95.text.toString(),
                button96.text.toString(),
                button97.text.toString(),
                button98.text.toString(),
                button99.text.toString(),
                button100.text.toString(),
                button101.text.toString(),
                button102.text.toString()
        ).forEach {
            println(it)
        }*/

        button28.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st27")
            startActivity(intent)
        }
        button29.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st28")
            startActivity(intent)
        }
        button30.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st29")
            startActivity(intent)
        }
        button31.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st30")
            startActivity(intent)
        }
        button32.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st31")
            startActivity(intent)
        }
        button33.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st32")
            startActivity(intent)
        }
        button34.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st33")
            startActivity(intent)
        }
        button35.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st34")
            startActivity(intent)
        }
        button36.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st35")
            startActivity(intent)
        }
        button37.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st36")
            startActivity(intent)
        }
        button38.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st37")
            startActivity(intent)
        }
        button39.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st38")
            startActivity(intent)
        }
        button40.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st39")
            startActivity(intent)
        }
        button41.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st40")
            startActivity(intent)
        }
        button42.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st41")
            startActivity(intent)
        }
        button43.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st42")
            startActivity(intent)
        }
        button44.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st43")
            startActivity(intent)
        }
        button45.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st44")
            startActivity(intent)
        }
        button46.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st45")
            startActivity(intent)
        }
        button47.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st46")
            startActivity(intent)
        }
        button48.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st47")
            startActivity(intent)
        }
        button49.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st48a")
            startActivity(intent)
        }
        button50.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st49")
            startActivity(intent)
        }
        button51.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st50")
            startActivity(intent)
        }
        button52.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st51")
            startActivity(intent)
        }
        button53.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st52")
            startActivity(intent)
        }
        button54.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st53")
            startActivity(intent)
        }
        button55.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st54")
            startActivity(intent)
        }
        button56.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st55")
            startActivity(intent)
        }
        button57.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st56")
            startActivity(intent)
        }
        button58.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st57")
            startActivity(intent)
        }
        button59.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st58")
            startActivity(intent)
        }
        button60.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st59")
            startActivity(intent)
        }
        button61.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st60")
            startActivity(intent)
        }
        button62.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st61")
            startActivity(intent)
        }
        button63.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st62")
            startActivity(intent)
        }
        button64.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st63")
            startActivity(intent)
        }
        button65.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st64")
            startActivity(intent)
        }
        button66.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st65")
            startActivity(intent)
        }
        button67.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st66")
            startActivity(intent)
        }
        button68.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st67")
            startActivity(intent)
        }
        button69.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st68")
            startActivity(intent)
        }
        button70.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st69")
            startActivity(intent)
        }
        button71.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st70")
            startActivity(intent)
        }
        button72.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st71")
            startActivity(intent)
        }
        button73.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st72")
            startActivity(intent)
        }
        button74.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st73")
            startActivity(intent)
        }
        button75.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st74")
            startActivity(intent)
        }
        button76.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st75")
            startActivity(intent)
        }
        button77.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st76")
            startActivity(intent)
        }
        button78.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st77")
            startActivity(intent)
        }
        button79.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st78")
            startActivity(intent)
        }
        button80.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st79")
            startActivity(intent)
        }
        button81.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st80")
            startActivity(intent)
        }
        button82.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st81")
            startActivity(intent)
        }
        button83.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st82")
            startActivity(intent)
        }
        button84.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st83")
            startActivity(intent)
        }
        button85.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st84")
            startActivity(intent)
        }
        button86.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st85")
            startActivity(intent)
        }
        button87.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st86")
            startActivity(intent)
        }
        button88.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st87")
            startActivity(intent)
        }
        button89.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st88")
            startActivity(intent)
        }
        button90.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st89")
            startActivity(intent)
        }
        button91.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st90")
            startActivity(intent)
        }
        button92.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st91")
            startActivity(intent)
        }
        button93.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st92")
            startActivity(intent)
        }
        button94.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st93")
            startActivity(intent)
        }
        button95.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st94")
            startActivity(intent)
        }
        button96.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st95")
            startActivity(intent)
        }
        button97.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st96")
            startActivity(intent)
        }
        button98.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st97")
            startActivity(intent)
        }
        button99.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st98")
            startActivity(intent)
        }
        button100.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st99")
            startActivity(intent)
        }
        button101.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st100")
            startActivity(intent)
        }
        button102.setOnClickListener {
            val intent = Intent(this@chnder, datacg::class.java).putExtra("id", "st101")
            startActivity(intent)
        }
    }
}