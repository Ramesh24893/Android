package com.example.myapplication

import android.app.ActivityManager
import android.content.Context
import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //intent.addFlags(FLAG_ACTIVITY_RESET_TASK_IF_NEEDED)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val act1= findViewById<Button>(R.id.mainbuttonActOne)
        act1.setOnClickListener {
            val intent= Intent(this,ActivityOne::class.java)
            startActivity(intent)
        }

        val act2= findViewById<Button>(R.id.mainbuttonAct2)
        act2.setOnClickListener {
            val intent= Intent(this,ActivityTwo::class.java)
//            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP )
//            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT)


            startActivity(intent)
        }
        val act3= findViewById<Button>(R.id.mainbuttonAct3)
        act3.setOnClickListener {
            val intent= Intent(this,ActivityThree::class.java)
            startActivity(intent)
        }

        val act4= findViewById<Button>(R.id.mainbuttonAct4)
        act4.setOnClickListener {
            val intent= Intent(this,ActivityFour::class.java)
            startActivity(intent)
        }


    }
    public fun check(){
        val activityManager = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        val appTasks = activityManager.appTasks

        appTasks.forEach {
            Log.e("Activity","ID ${it.taskInfo.taskId}        Number of activities${it.taskInfo.numActivities}")
        }


        if (appTasks.isNotEmpty()) {
            val currentTask = appTasks[0]
            val taskInfo = currentTask.taskInfo
            val topActivity = taskInfo.topActivity

            Log.e("Activity", "Top Activity: ${topActivity?.className}")
        }
    }
}