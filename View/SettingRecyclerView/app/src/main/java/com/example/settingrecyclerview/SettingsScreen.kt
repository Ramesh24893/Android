package com.example.settingrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SettingsScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_ui)
        val data= Data.getData()
        val recyclerView=findViewById<RecyclerView>(R.id.recycler_view)
        val adapterBinder= UISettingsAdapter(data)


        recyclerView.apply {
            adapter=adapterBinder
            layoutManager= LinearLayoutManager(this@SettingsScreen, LinearLayoutManager.VERTICAL,false)
        }
    }
}