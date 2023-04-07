package com.example.linearlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val suggestion=arrayOf("MECH","IT","EEE","ECE","CSC")
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,suggestion)
        val autoComplete=findViewById<AutoCompleteTextView>(R.id.autoTextDepartment)
        autoComplete.setAdapter(adapter)
       autoComplete.setOnFocusChangeListener { view, b -> if(b) autoComplete.showDropDown() }


    }
}