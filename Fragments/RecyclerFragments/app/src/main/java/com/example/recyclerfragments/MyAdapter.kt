package com.example.recyclerfragments

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(private val newsList: ArrayList<News>): RecyclerView.Adapter<MyAdapter.ViewHolder>() {

   lateinit var  myListener : onItemClickListener
   interface onItemClickListener{
       fun onClick(position : Int)
   }
    fun setOnItemClickListener( listener: onItemClickListener){
            myListener=listener
    }

    class ViewHolder (itemView : View,listener: onItemClickListener): RecyclerView.ViewHolder(itemView){
        val titleImage : ShapeableImageView = itemView.findViewById(R.id.title_image)
        val tvHeading : TextView = itemView.findViewById(R.id.tvHeading)

        init{
            itemView.setOnClickListener {
                listener.onClick(adapterPosition)
            }
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view= ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false),myListener)
        return view
    }

    override fun getItemCount(): Int {
        return  newsList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = newsList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.tvHeading.text=currentItem.heading
    }
}