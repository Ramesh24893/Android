package com.example.recyclerview2

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class MainActivity : AppCompatActivity() {

    val users=ArrayList<Contacts>()

  init {

      users.add(Contacts("Ramesh", "1223345454"))
      users.add(Contacts("Ram", "1223345454"))
      users.add(Contacts("Rajesh", "1223345454"))
      users.add(Contacts("Rakesh", "1223345454"))
      users.add(Contacts("Ramesh", "1223345454"))
      users.add(Contacts("Ram", "1223345454"))
      users.add(Contacts("Rajesh", "1223345454"))
      users.add(Contacts("Rakesh", "1223345454"))
      users.add(Contacts("Ramesh", "1223345454"))
      users.add(Contacts("Ram", "1223345454"))
      users.add(Contacts("Rajesh", "1223345454"))
      users.add(Contacts("Rakesh", "1223345454"))
      users.add(Contacts("Ramesh", "1223345454"))
      users.add(Contacts("Ram", "1223345454"))
      users.add(Contacts("Rajesh", "1223345454"))
      users.add(Contacts("Rakesh", "1223345454"))
      users.add(Contacts("Ramesh", "1223345454"))
      users.add(Contacts("Ram", "1223345454"))
      users.add(Contacts("Rajesh", "1223345454"))
      users.add(Contacts("Rakesh", "1223345454"))
      users.add(Contacts("Rajesh", "1223345454"))
      users.add(Contacts("Rakesh", "1223345454"))
      users.add(Contacts("Ramesh", "1223345454"))
      users.add(Contacts("Ram", "1223345454"))
      users.add(Contacts("Rajesh", "1223345454"))
      users.add(Contacts("Rakesh", "1223345454"))
      users.add(Contacts("Rajesh", "1223345454"))
      users.add(Contacts("Rakesh", "1223345454"))
      users.add(Contacts("Ramesh", "1223345454"))
      users.add(Contacts("Ram", "1223345454"))
      users.add(Contacts("Rajesh", "1223345454"))
      users.add(Contacts("Rakesh", "1223345454"))
  }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv=findViewById<RecyclerView>(R.id.recyclerView)

        rv.apply {
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
            adapter = SimpleAdapter (users)


        }
        Log.d(ContentValues.TAG, "On Create View Holder called  ${rv.computeHorizontalScrollExtent()}  ")
    }


}