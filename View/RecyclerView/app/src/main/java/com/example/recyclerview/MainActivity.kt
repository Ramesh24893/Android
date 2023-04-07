package com.example.recyclerview

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import androidx.recyclerview.widget.RecyclerView.SmoothScroller
import androidx.viewpager.widget.PagerAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn=findViewById<FloatingActionButton>(R.id.Button)


        val recyclerView=findViewById<RecyclerView>(R.id.recyclerView)
        Log.d(TAG, "Recycler view $recyclerView.javaClass ")
  val cities=Cities.getData()
        val adapter=MyAdapter(cities )


        adapter.addItem(Cities(R.drawable.download,"Chennai",R.string.chennai))
        var itemDec=DividerItemDecoration(this,DividerItemDecoration.VERTICAL)
        itemDec.setDrawable(getDrawable(R.drawable.divider)!!)
        recyclerView.addItemDecoration(itemDec)
        recyclerView.adapter = adapter




        recyclerView.setHasFixedSize(true)

        val mana=CustomLinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        mana.isSmoothScrollbarEnabled=true
        btn.setOnClickListener {
//            adapter.addItem(Cities(R.drawable.b,"Vallioor",R.string.goa))
//            adapter.addItem(Cities(R.drawable.b,"Therku Vallioor",R.string.goa))
//            adapter.notifyDataSetChanged()
           // mana.scrollToPositionWithOffset(4,90)
           // mana.orientation=LinearLayoutManager.HORIZONTAL

        //    mana.reverseLayout=true

                // mana.onLayoutChildren(Recycler(),RecyclerView.State())

//last visible position
//           val pos= mana.findLastVisibleItemPosition()
//            Log.d(TAG,"Position is $pos",)

//smooth scrool to position
  //mana.smoothScrollToPosition(recyclerView,RecyclerView.State(),0)



        //  cities.add(Cities(R.drawable.b,"Vallioor",R.string.goa))
          //  adapter.addItem(Cities(R.drawable.b,"Vallioor",R.string.goa))
//            adapter.addItem(Cities(R.drawable.b,"Therku Vallioor",R.string.goa))
            //adapter.notifyItemRangeInserted(10,2)
            //adapter.notifyItemRemoved(1)
//            adapter.notifyItemInserted(1)

        }




         recyclerView.layoutManager = mana
adapter.setOnIteClickListener(object : MyAdapter.onItemClickListener{
    override fun onItemClick(position: Int) {
       // Toast.makeText(this@MainActivity,"vxhgvcg",Toast.LENGTH_SHORT).show()

        val intent =Intent(this@MainActivity,InfoActivity::class.java)
        val city=Cities.getData()[position]
        intent.putExtra("city",city.text)
        intent.putExtra("image",city.id)
        intent.putExtra("info",city.info)
        startActivity(intent)
    }

})
    }
    }
