package com.example.recyclerview

import android.content.ContentValues.TAG
import android.graphics.Color

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView


class MyAdapter(val item: ArrayList<Cities>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    private lateinit var mListener : onItemClickListener

    interface onItemClickListener{
        fun onItemClick(position: Int)
    }

    fun setOnIteClickListener(listener : onItemClickListener){
        mListener= listener
    }

    fun addItem( item : Cities){
        this.item.add(item)
    }

    override fun getItemViewType(position: Int): Int {
        Log.d(TAG, "On view type called $position  ")
        return super.getItemViewType(position)
    }



    class ViewHolder(itemView: View, listener: onItemClickListener) : RecyclerView.ViewHolder(itemView) {
        val imageTv = itemView.findViewById<ImageView>(R.id.imageTv)
        val textView = itemView.findViewById<TextView>(R.id.textView)
        //val layout= itemView.findViewById<LinearLayout>(R.id.layout)


        fun bindItems(item: Cities,position: Int) {
            imageTv.setImageResource(item.id)
            textView.text = item.text
        }
        init {

            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Log.d(TAG, "On Create View Holder called $parent.javaClass ")
        //parent.setBackgroundColor(Color.GREEN)

        val view= LayoutInflater.from(parent.context).inflate(R.layout.layout_1,parent,false)
       // view.setBackgroundColor(Color.GRAY)
        return ViewHolder(view, mListener)
    }

    override fun getItemCount(): Int {
        val i=item.size

        return item.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d(TAG, "On Bind View Holder called $position")
        holder.bindItems(item[position],position)
    }
//    override fun bindViewHolder(holder: ViewHolder, position: Int){
//
//    }

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        Log.d(TAG, "onAttachedToRecyclerView " +
                "Adapter is attached to RV ")
        super.onAttachedToRecyclerView(recyclerView)
    }


    override fun onDetachedFromRecyclerView(recyclerView: RecyclerView) {
        Log.d(TAG, "onDetachedFromRecyclerView +" +
                "Adapter io detached ")
        super.onDetachedFromRecyclerView(recyclerView)
    }

    override fun onFailedToRecycleView(holder: ViewHolder): Boolean {
        Log.d(TAG, "onFailedToRecycleView ")
        return super.onFailedToRecycleView(holder)
    }

    override fun onViewAttachedToWindow(holder: ViewHolder) {
        Log.d(TAG, "onViewAttachedToWindow ")
        super.onViewAttachedToWindow(holder)
    }

    override fun onViewRecycled(holder: ViewHolder) {
        Log.d(TAG, "onViewRecycled  ")
        super.onViewRecycled(holder)
    }

    override fun getItemId(position: Int): Long {
        Log.d(TAG, "getItemId")
        return super.getItemId(position)
    }

    override fun onViewDetachedFromWindow(holder: ViewHolder) {
        Log.d(TAG, "onViewDetachedFromWindow ")
        super.onViewDetachedFromWindow(holder)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int, payloads: MutableList<Any>) {
        //Log.d(TAG, "onBindView Holder $position ${payloads.size} ,  Payloads")

        super.onBindViewHolder(holder, position, payloads)
    }

    override fun registerAdapterDataObserver(observer: RecyclerView.AdapterDataObserver) {
        Log.d(TAG, "registerAdapterDataObserver")
        super.registerAdapterDataObserver(observer)
    }

    override fun unregisterAdapterDataObserver(observer: RecyclerView.AdapterDataObserver) {
        Log.d(TAG, "unregisterAdapterDataObserver")
        super.unregisterAdapterDataObserver(observer)
    }

    override fun setHasStableIds(hasStableIds: Boolean) {
        Log.d(TAG, "setHasStableIds")
        super.setHasStableIds(hasStableIds)
    }
}

//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//
//        Log.d(TAG, "On Create View Holder called  ")
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_1, parent, false)
//        return ViewHolder(view, mListener)
//    }
//
//    override fun getItemCount(): Int {
//        val i = item.size
//        Log.d(TAG, "get Item count called $i ")
//        return item.size
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        Log.d(TAG, "On Bind View Holder called $position")
//        holder.bindItems(item[position])
//    }

