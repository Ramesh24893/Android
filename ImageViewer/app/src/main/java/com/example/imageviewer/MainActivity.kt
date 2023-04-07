package com.example.imageviewer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var btChange: Button
    lateinit var imgView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btChange=findViewById(R.id.btChange)
        imgView=findViewById(R.id.imgView)
        var count=0
        btChange.setOnClickListener{
            count++
            when(count){
                1-> imgView.setImageResource(R.drawable.siva)
                2-> imgView.setImageResource(R.drawable.woman)
                3-> imgView.setImageResource(R.drawable.snow)
                4-> imgView.setImageResource(R.drawable.background)
                5-> {
                    count = 1
                    imgView.setImageResource(R.drawable.siva)
                }
            }

        }
    }
}