package com.example.textview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.Spannable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

     lateinit var tv : TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.letscount)
//        tv = findViewById(R.id.tvCount)
//        var count=1
//        val btn=findViewById<Button>(R.id.btnCount)
//        btn.setOnClickListener{
//            count++
//            tv.text="Lets count together :$count"
//        }
        val textView=findViewById<EditText>(R.id.tvCount)
        val word = textView.text

    }
}