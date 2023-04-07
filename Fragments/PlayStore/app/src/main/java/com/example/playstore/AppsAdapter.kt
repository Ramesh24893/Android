package com.example.playstore

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.playstore.Models.AppsModel

class AppsAdapter( val appsList : ArrayList<AppsModel>): RecyclerView.Adapter<AppsAdapter.ViewHolder>(){


    private lateinit var mListener : onItemClickListener

    interface onItemClickListener{
        fun onItemClick(position: Int)
    }

    fun setOnIteClickListener(listener : onItemClickListener){
        mListener= listener
    }
    class ViewHolder (view : View,listener: onItemClickListener): RecyclerView.ViewHolder(view){
        val appImage : ImageView = view.findViewById(R.id.iv_app_image)
        val appName : TextView = view.findViewById(R.id.tv_app_name)
        val appRat : TextView = view.findViewById(R.id.tv_app_rating)
        val appRatingIcon : ImageView = view.findViewById(R.id.iv_rating_icon)
        val cardView : LinearLayout = view.findViewById(R.id.cardView)

        init {

            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }

        fun bindItems(app : AppsModel){
            appImage.setImageResource(app.appImage)
            appName.text= app.appName
            appRat.text= app.appRating.toString()
            appRatingIcon.setImageResource(app.icon)


        }



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.items_apps_list_horizontal,parent,false)

        return ViewHolder(view, mListener)
    }


    override fun getItemCount(): Int {
        return  appsList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(appsList[position])
    }



}