package com.example.recyclergrid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val data : ArrayList<Picture>): RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    class ViewHolder(item : View) : RecyclerView.ViewHolder(item){
        val img_row = item.findViewById<ImageView>(R.id.img_row)
        val tvx_row = item.findViewById<TextView>(R.id.txv_row)

        fun bindData(picture : Picture){
            img_row.setImageResource(picture.imageId)
            tvx_row.text=picture.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(data[position])
    }
}