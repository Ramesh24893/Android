package com.example.settingrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class UISettingsAdapter(val items: List<UICompData>): RecyclerView.Adapter<UISettingsAdapter.ComponentHolder>() {
    class ComponentHolder(val item : View) : RecyclerView.ViewHolder(item) {
        val iconIv= item.findViewById<ImageView>(R.id.img_icon)
        val optionTv=item.findViewById<TextView>(R.id.options_tv)
        val optionInfoTv=item.findViewById<TextView>(R.id.option_info_tv)

        fun bindItems(data : UICompData){
            iconIv.setImageResource(data.iconImgId)
            optionTv.text=data.txtIconName
            optionInfoTv.text=data.txtFeatures
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComponentHolder {
        return ComponentHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false))
    }

    override fun getItemCount(): Int {
       return items.size
    }

    override fun onBindViewHolder(holder: ComponentHolder, position: Int) {
        holder.bindItems(items[position])
    }
}