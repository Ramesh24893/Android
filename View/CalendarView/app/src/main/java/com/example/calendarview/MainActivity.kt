package com.example.calendarview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val calView = findViewById<CalendarView>(R.id.calViewStartDate)
        calView.setFirstDayOfWeek(Calendar.SATURDAY)

//        Toast.makeText(this,"First day $s ",Toast.LENGTH_LONG).show()

        var dob=""
        calView.setOnDateChangeListener { calendarView, i, i2, i3 ->
                 dob="$i3/$i2/$i"

        }

        val btCalculate = findViewById<Button>(R.id.btCalculate)
        btCalculate.setOnClickListener {
            Toast.makeText(this,"Your DOB $dob is saved",Toast.LENGTH_LONG).show()
        }

        }
    }
