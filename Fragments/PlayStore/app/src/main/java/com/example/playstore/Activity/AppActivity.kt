package com.example.playstore.Activity

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.playstore.Fragment.FragmentAppDescription
import com.example.playstore.R

class AppActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.app_description)

        val appImage = findViewById<ImageView>(R.id.appImage)
        val appName = findViewById<TextView>(R.id.appName)
        val rating = findViewById<TextView>(R.id.rating)
        val bundle : Bundle? =intent.extras
        val back = findViewById<ImageView>(R.id.back)
        back.setOnClickListener{
            finish()
        }
        appName.text=bundle?.getString("appName")
        appImage.setImageResource(bundle?.getInt("appImage")!!)
        rating.text= bundle.getString("appRating")


        //supportFragmentManager.beginTransaction().replace(R.id.fragContainer,FragmentAppDescription())
    }

}