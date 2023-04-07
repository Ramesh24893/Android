package com.example.playstore.Activity


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar

import androidx.viewpager2.widget.ViewPager2
import com.example.playstore.R
import com.example.playstore.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() ,FragmentInteractionListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      setContentView(R.layout.activity_main)
       // setContentView(R.layout.app_description)

        val viewPager = findViewById<ViewPager2>(R.id.viewPager2)
        viewPager.adapter= ViewPagerAdapter(this)
        viewPager.isUserInputEnabled=false
        val tabLay = findViewById<TabLayout>(R.id.tabLayout1)

        TabLayoutMediator(tabLay,viewPager){tab,position->
            when(position){
                0 -> {
                    tab.text = "For you"

                }

                1 -> tab.text="Top charts"
                2 -> tab.text ="Kids"
                3 -> tab.text="Categories"
            }
        }.attach()
//        val intent = Intent(this@MainActivity,AppActivity::class.java)
//        startActivity(intent)
        supportFragmentManager.setFragmentResultListener(
            "fragA", this
        ) { requestKey, result ->

        val toolBar= findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
            setSupportActionBar(toolBar)



        }





    }

    override fun onFragmentInteraction() {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
      //  fragmentTransaction.replace(R.id.fragContainer, Activity1Fragment())
        fragmentTransaction.commit()
    }
}

interface FragmentInteractionListener {
    fun onFragmentInteraction()
}