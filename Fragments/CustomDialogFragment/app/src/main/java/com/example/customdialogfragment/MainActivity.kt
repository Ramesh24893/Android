package com.example.customdialogfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dialog = CustomDialogFragment()
        val rater = findViewById<TextView>(R.id.rate_us)

        val tranc = supportFragmentManager.beginTransaction()
        tranc.addToBackStack(null)
        rater.setOnClickListener {

            dialog.showNow(supportFragmentManager, "customDialog")
            // dialog.isCancelable= false

            //val obj = dialog.dialog


            supportFragmentManager.addOnBackStackChangedListener {
                for(i in 0 until supportFragmentManager.backStackEntryCount){
                    Log.e("TAG", "'FRAGMENT  '${supportFragmentManager.getBackStackEntryAt(i).name.toString()}")
                }
            }


        }

    }
}