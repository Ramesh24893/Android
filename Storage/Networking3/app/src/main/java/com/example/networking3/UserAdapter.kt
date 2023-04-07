package com.example.networking3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(val context: Context, val items: ArrayList<UserModelClass>) :
    RecyclerView.Adapter<UserAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.item_user_layout,
                parent,
                false
            )
        )
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = items.get(position)

        holder.tvId.text = item.id.toString()
        holder.tvName.text = item.name
        holder.tvEmail.text = item.email
        holder.tvGender.text = item.gender
        holder.tvWeight.text = item.weight.toString()
        holder.tvHeight.text = item.height.toString()
        holder.tvMobileNumber.text = item.mobile
        holder.tvOfficeNumber.text = item.office
    }


    override fun getItemCount(): Int {
        return items.size
    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        // Holds the TextView that will add each item to
        val tvId = view.findViewById<TextView>(R.id.tv_id)
        val tvName = view.findViewById<TextView>(R.id.tv_name)
        val tvEmail = view.findViewById<TextView>(R.id.tv_email)
        val tvGender = view.findViewById<TextView>(R.id.tv_gender)
        val tvWeight = view.findViewById<TextView>(R.id.tv_weight)
        val tvHeight = view.findViewById<TextView>(R.id.tv_height)
        val tvMobileNumber = view.findViewById<TextView>(R.id.tv_mobile)
        val tvOfficeNumber = view.findViewById<TextView>(R.id.tv_office_number)
    }
}