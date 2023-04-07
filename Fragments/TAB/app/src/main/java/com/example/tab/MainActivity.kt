package com.example.tab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TableLayout
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLay = findViewById<TabLayout>(R.id.tabLayout)
        tabLay.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                Log.e("TAG","onTabSelected                  ${tab?.text.toString()}")
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                Log.e("TAG","onTabUnselected                     ${tab?.text.toString()}")
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                Log.e("TAG","onTabReselected                     ${tab?.text.toString()}")
            }

        })

        val viewPager = findViewById<ViewPager2>(R.id.viewPager2)



        val vAdapter = ViewPager2Adapter(this)

        viewPager.adapter = vAdapter
        TabLayoutMediator(tabLay,viewPager){tab,position ->
           when(position){

               0 ->{
                   tab.text="CHATS"
                   tab.icon=getDrawable(R.drawable.baseline_chat_24)

               } 1 -> {
               tab.text = "STATUS"
               tab.icon=getDrawable(R.drawable.baseline_audiotrack_24)
           }
               2 -> {
                   tab.text="CALLS"
                   tab.icon=getDrawable(R.drawable.baseline_call_24)
               }
           }


        }.attach()




//        var itemDec= DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
//        itemDec.setDrawable(this?.getDrawable(R.drawable.divider)!!)
//        viewPager.addItemDecoration(itemDec)
    }
}

































































//val tabPage = object : TabLayout.TabLayoutOnPageChangeListener(tabLay) {
//    override fun onPageScrollStateChanged(state: Int) {
//        super.onPageScrollStateChanged(state)
//        Log.e("TAG","               onPageScrollStateChanged"     )
//    }
//
//    override fun onPageScrolled(
//        position: Int,
//        positionOffset: Float,
//        positionOffsetPixels: Int
//    ) {
//
//        super.onPageScrolled(position, positionOffset, positionOffsetPixels)
//        Log.e("TAG","               onPageScrolled " )
//    }
//
//    override fun onPageSelected(position: Int) {
//
//        super.onPageSelected(position)
//        Log.e("TAG","      onPageSelected")
//    }
//}