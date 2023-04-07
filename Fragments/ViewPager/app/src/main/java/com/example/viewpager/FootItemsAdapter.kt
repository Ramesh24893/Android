package com.example.viewpager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FootItemsAdapter(private val foodItems: List<Items>): RecyclerView.Adapter<FootItemsAdapter.ViewHolder>() {
    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        val imageId =view.findViewById<ImageView>(R.id.ivimage)
        val headingTv =view.findViewById<TextView>(R.id.tvHeading)
        val tvDesc =view.findViewById<TextView>(R.id.tvDesc)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.viewpager_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return foodItems.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item=foodItems[position]
        holder.imageId.setImageResource(item.imageId)
        holder.headingTv.text=item.heading
        holder.tvDesc.text=item.description
    }
}