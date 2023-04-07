package com.example.recyclerview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class InfoActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.info)

        val citytv : TextView=findViewById(R.id.citytv)
        val infotv : TextView=findViewById(R.id.infoTv)
        val imagetv : ImageView =findViewById(R.id.imagetv)


        val bundle : Bundle? =intent.extras
        citytv.text=bundle!!.getString("city")
        imagetv.setImageResource(bundle.getInt("image"))
        infotv.text= getString(bundle.getInt("info"))


    }
}