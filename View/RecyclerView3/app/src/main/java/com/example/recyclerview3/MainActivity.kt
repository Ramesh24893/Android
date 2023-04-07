package com.example.recyclerview3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycler_view)

        val message= listOf(
            Message.FromMessage("hi"),
            Message.FromMessage("hjhbvjhvbji"),
            Message.FromMessage("hjhbvjhvbji"),
            Message.ToMessage("Hello"),
            Message.FromMessage("hjhbvjhvbji"),
           Message.FromMessage("hkjkjbi"),
            Message.ToMessage("He,jnkjllo"),
           Message.FromMessage(",knlknhi"),
            Message.ToMessage("Hello"),
            Message.FromMessage("hi"),
            Message.ToMessage("Hello"),
            Message.FromMessage("hi"),
            Message.ToMessage("Hello"),
            Message.FromMessage("hi"),
            Message.FromMessage("hi"),
            Message.ToMessage("Hello"),
            Message.FromMessage("hi"),
            Message.ToMessage("Hello"),
            Message.FromMessage("hi"),
            Message.ToMessage("Hello"),
            Message.FromMessage("hi"),
            Message.ToMessage("Hello"),
            Message.FromMessage("hi"),
            Message.FromMessage("hi"),
            Message.ToMessage("Hello"),
            Message.FromMessage("hi"),
            Message.ToMessage("Hello"),
            Message.FromMessage("hi"),
            Message.ToMessage("Hello"),

            Message.FromMessage("hi"),
            Message.ToMessage("Hello"),
            Message.FromMessage("hi"),
            Message.ToMessage("Hello"),
            Message.FromMessage("hi"),
            Message.FromMessage("hi"),
            Message.ToMessage("Hello"),
            Message.FromMessage("hi"),
            Message.ToMessage("Hello"),
            Message.FromMessage("hi"),
            Message.ToMessage("Hello"),
            Message.FromMessage("hi"),
            Message.ToMessage("Hello"),
            Message.FromMessage("hi"),
            Message.FromMessage("hi"),
            Message.ToMessage("Hello"),
            Message.FromMessage("hi"),
            Message.ToMessage("Hello"),
            Message.FromMessage("hi"),
            Message.ToMessage("Hello"),
        )
        val adap=Adapter(message)

        val recyclerView=findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter=adap
        recyclerView.layoutManager =CustomLAyoutManager(this, LinearLayoutManager.VERTICAL,false)


    }
}