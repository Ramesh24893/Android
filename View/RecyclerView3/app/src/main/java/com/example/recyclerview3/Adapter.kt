package com.example.recyclerview3

import android.content.ContentValues.TAG
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class Adapter(val items : List<Message>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       Log.d(TAG, "On Create View Holder called $viewType ")
        return when(viewType){
            R.layout.from -> {

                //Log.d(TAG, " l from")
                FromViewHolder(
                    LayoutInflater.from(parent.context).inflate(R.layout.from, parent, false)
                )

            }
             R.layout.to -> {
               //  Log.d(TAG, " t from")
                 ToViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.to,parent,false))}
            else -> throw IllegalArgumentException("Invalid ViewType Provided")
        }

    }

    override fun getItemCount(): Int {
        return items.size
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
      //  Log.d(TAG, "to message message ${items[position].javaClass}")
        Log.d(TAG, "On Bind View Holder called $position")
      //  Log.d(TAG, "holder class ${holder.javaClass}")
        when(holder) {
            is FromViewHolder -> {
                //Log.d(TAG, "fromholder message message ${items[position].javaClass}")
                holder.bindItems(items[position] as Message.FromMessage)
            }

            is ToViewHolder -> {
                //Log.d(TAG, "toholder message message ${items[position].javaClass}")
                holder.bindItems(items[position] as Message.ToMessage)
            }

        }
    }



    override fun getItemViewType(position: Int): Int {
        Log.d(TAG, "View type $position")
        return when(items[position]){
            is Message.ToMessage -> {R.layout.to

            }
            is Message.FromMessage -> {
                R.layout.from

            }
        }
    }

    class FromViewHolder( view: View): RecyclerView.ViewHolder(view){
        val textView=view.findViewById<TextView>(R.id.textView)

        fun bindItems(mes : Message.FromMessage){
            textView.text =mes.message
        }

    }
    class ToViewHolder( view : View): RecyclerView.ViewHolder(view) {
        val textView=view.findViewById<TextView>(R.id.textView)

        fun bindItems(mes : Message.ToMessage){
            textView.text =mes.message
        }

    }

}