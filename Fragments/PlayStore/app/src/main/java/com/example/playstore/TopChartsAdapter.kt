package com.example.playstore

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.playstore.Models.AppsChartModel

class TopChartsAdapter(val appsList : ArrayList<AppsChartModel>) : RecyclerView.Adapter<TopChartsAdapter.ViewHolder>() {

    private lateinit var mListener : onItemClickListener

    interface onItemClickListener{
        fun onItemClick(position: Int)
    }

    fun setOnIteClickListener(listener : onItemClickListener){
        mListener= listener
    }

    class ViewHolder (view : View,listener: onItemClickListener): RecyclerView.ViewHolder(view){

        val appImage : ImageView = view.findViewById(R.id.chartAppImage)
        val appName : TextView = view.findViewById(R.id.chartAppName)
        val appRat : TextView = view.findViewById(R.id.chartRating)
        val appRatingIcon : ImageView = view.findViewById(R.id.chartratingIcon)
        val appSize : TextView = view.findViewById(R.id.chartAppSize)
        val appCategory : TextView = view.findViewById(R.id.chartCategory)
        val order : TextView = view.findViewById(R.id.chartOrder)



        init {

            view.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }

        fun bindItems(app : AppsChartModel){
            appImage.setImageResource(app.image)
            appName.text= app.appName
            appRat.text= app.rating.toString()
            appRatingIcon.setImageResource(app.ratIcon)
            appSize.text=app.appSize.toString()
            appCategory.text=app.category
            order.text=app.position.toString()


        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.top_charts,parent,false)

        return ViewHolder(view, mListener)
    }

    override fun getItemCount(): Int {
        return appsList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(appsList[position])

    }
}