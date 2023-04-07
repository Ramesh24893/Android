package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button

class ActivityOne : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)

        val act1= findViewById<Button>(R.id.mainbuttonActOne)
        act1.setOnClickListener {
            val intent= Intent(this,ActivityOne::class.java)
            startActivity(intent)
        }

        val act2= findViewById<Button>(R.id.mainbuttonAct2)
        act2.setOnClickListener {
            val intent= Intent(this,ActivityTwo::class.java)
//            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
//            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT)
            startActivity(intent)
        }
        val act3= findViewById<Button>(R.id.mainbuttonAct3)
        act3.setOnClickListener {
            val intent= Intent(this,ActivityThree::class.java)
            startActivity(intent)
        }
        val act4= findViewById<Button>(R.id.mainbuttonAct4)
        act4.setOnClickListener {
            val intent= Intent(this,ActivityFour::class.java)
            startActivity(intent)
        }

        check()
    }

    override fun onNewIntent(intent: Intent?) {
        Log.e("TAG","ON NEW INRENT CALLED")
        super.onNewIntent(intent)
        check()
    }

    override fun onBackPressed() {
        check()
        super.onBackPressed()
    }
}