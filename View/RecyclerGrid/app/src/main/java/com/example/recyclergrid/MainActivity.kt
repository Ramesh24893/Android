package com.example.recyclergrid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data=Data.getData()
        val ada = MyAdapter(data)
        val recyclerView=findViewById<RecyclerView>(R.id.recyclerView)
        val manager= StaggeredGridLayoutManager(2,LinearLayoutManager.VERTICAL)
        //val manager=GridLayoutManager(this,2)
        recyclerView.apply {
            layoutManager=manager
            adapter=ada
        }

    }
}