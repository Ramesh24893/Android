package com.example.enterbio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.EditText
import android.widget.MultiAutoCompleteTextView
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val suggestion=arrayOf("India","Pakistan","Srilanka","Israel")
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,suggestion)
        val autoComplete=findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)
        autoComplete.setAdapter(adapter)
        autoComplete.setOnFocusChangeListener { view, b -> if(b) autoComplete.showDropDown() }
        val sports= arrayOf("Football","Cricket","Tennis","VolleyBall","Rugby")
        val sportAdapter=ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,sports)

        val multiAutoComplete =findViewById<MultiAutoCompleteTextView>(R.id.favouriteSports)
        multiAutoComplete.setAdapter(sportAdapter)
        multiAutoComplete.setTokenizer(MultiAutoCompleteTextView.CommaTokenizer())

    }
}