package com.example.recyclerview3

import android.content.Context
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CustomLAyoutManager : LinearLayoutManager{
    constructor(context : Context) : super(context)
    constructor(context: Context,orientation : Int,reverse : Boolean) : super(
        context,orientation,reverse
            )


    override fun requestLayout() {
        Log.e("TAG","REQUEST LAYOUT")
        super.requestLayout()
    }

    override fun getChildCount(): Int {
        Log.e("TAG","getChildCount ${super.getChildCount()}")
        return super.getChildCount()
    }

    override fun onLayoutChildren(recycler: RecyclerView.Recycler?, state: RecyclerView.State?) {
        Log.e("TAG","onLayoutChildren")
        super.onLayoutChildren(recycler, state)
    }

    override fun onLayoutCompleted(state: RecyclerView.State?) {
        Log.e("TAG","onLayoutCompleted")
        super.onLayoutCompleted(state)
    }

}