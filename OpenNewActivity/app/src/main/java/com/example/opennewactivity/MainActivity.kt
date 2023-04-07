package com.example.opennewactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val secActiBut=findViewById<Button>(R.id.secActiBut)
        secActiBut.setOnClickListener {
            val intent=Intent(this,Activity2::class.java)
            startActivity(intent)
        }
    }
}