package com.example.playstore

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.playstore.Activity.MainActivity
import com.example.playstore.Fragment.FragmentOne
import com.example.playstore.Fragment.FragmentThree
import com.example.playstore.Fragment.FragmentTwo

class ViewPagerAdapter(activity: MainActivity): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0-> FragmentOne()
            1-> FragmentTwo()
            2 -> FragmentThree()
            3 -> FragmentThree()

            else-> throw IndexOutOfBoundsException()
        }
    }

}