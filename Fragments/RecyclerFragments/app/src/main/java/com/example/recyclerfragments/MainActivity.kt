package com.example.recyclerfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentManager= supportFragmentManager
        fragmentManager.beginTransaction().apply{
            replace(R.id.fragmentContainerView1,HomeFragment())
            commit()
        }
        fragmentManager.beginTransaction().apply{
            replace(R.id.fragmentContainerView2,FragmentTwo())
            commit()
        }
    }
}