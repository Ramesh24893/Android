package com.example.tab

import android.util.Log
import android.view.View
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.adapter.FragmentViewHolder

class ViewPager2Adapter(activity: MainActivity): FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        Log.e("TAG","getItemCount")
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        Log.e("TAG","createFragment")
        return when(position){
            0 -> {
                Log.e("TAG", "createFragment       0")
                FragmentFirst()
            }
            1 ->{
                Log.e("TAG", "createFragment        1")
                FragmentSecond()
            }
            2 ->{
                Log.e("TAG", "createFragment         2")
                FragmentThree()
            }
            else -> throw IndexOutOfBoundsException()
        }
    }

    override fun onBindViewHolder(
        holder: FragmentViewHolder,
        position: Int,
        payloads: MutableList<Any>
    ) {
        Log.w("TAG","onBindViewHolder       $position")
        super.onBindViewHolder(holder, position, payloads)
    }

    override fun getItemViewType(position: Int): Int {
        Log.e("TAG","getItemViewType   $position")
        return super.getItemViewType(position)
    }

    override fun getItemId(position: Int): Long {
        Log.e("TAG","getItemId       $position")
        return super.getItemId(position)
    }

    override fun onViewDetachedFromWindow(holder: FragmentViewHolder) {
        Log.e("TAG","onViewDetachedFromWindow")
        super.onViewDetachedFromWindow(holder)
    }

    override fun registerAdapterDataObserver(observer: RecyclerView.AdapterDataObserver) {
        Log.e("TAG","registerAdapterDataObserver")
        super.registerAdapterDataObserver(observer)
    }

    override fun unregisterAdapterDataObserver(observer: RecyclerView.AdapterDataObserver) {
        Log.e("TAG","unregisterAdapterDataObserver")
        super.unregisterAdapterDataObserver(observer)
    }

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        Log.e("TAG","onAttachedToRecyclerView")
        super.onAttachedToRecyclerView(recyclerView)
    }

    override fun onDetachedFromRecyclerView(recyclerView: RecyclerView) {
        Log.e("TAG","onDetachedFromRecyclerView")
        super.onDetachedFromRecyclerView(recyclerView)
    }

//    override fun gcFragments() {
//        super.gcFragments()
//    }
//
//    override fun placeFragmentInViewHolder(holder: FragmentViewHolder) {
//        super.placeFragmentInViewHolder(holder)
//    }
//
//    override fun addViewToContainer(v: View, container: FrameLayout) {
//        super.addViewToContainer(v, container)
//    }
//
//    override fun shouldDelayFragmentTransactions(): Boolean {
//        return super.shouldDelayFragmentTransactions()
//    }

    override fun containsItem(itemId: Long): Boolean {
        Log.e("TAG","containsItem       $itemId")
        return super.containsItem(itemId)
    }

}