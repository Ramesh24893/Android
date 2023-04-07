package com.example.fragmentmanagercommunication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    private val fragManager : FragmentManager =supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragA=FragmentA()
        val btn1 = findViewById<Button>(R.id.button1)
        btn1.setOnClickListener{
            fragManager.beginTransaction().replace(R.id.fragContainer,fragA).addToBackStack(null).commit()

        }
        val fragB=FragmentB()
        val btn2 = findViewById<Button>(R.id.button2)
        btn2.setOnClickListener{
            fragManager.beginTransaction().replace(R.id.fragContainer,fragB).addToBackStack(null).commit()
        }
//        supportFragmentManager.setFragmentResultListener(
//            "fragA", this
//        ) { requestKey, result ->
//
//            textview.text = result.getString("text")
//
//
//
//        }
    }
}