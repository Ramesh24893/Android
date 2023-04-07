package com.example.ratingbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RatingBar
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ratingBar=findViewById<RatingBar>(R.id.ratBar)
        ratingBar.rating=2.5f
        ratingBar.stepSize=.1f
        ratingBar.setOnRatingBarChangeListener { ratingBar, fl, b ->
            Toast.makeText(this,"Rating is ${ratingBar.rating}",Toast.LENGTH_SHORT).show()
        }
    }
}