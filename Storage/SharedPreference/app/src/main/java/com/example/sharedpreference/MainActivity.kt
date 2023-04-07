package com.example.sharedpreference

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.editTextTextPersonName)
        val etAge = findViewById<EditText>(R.id.editTextTextPersonAge)
        val cbAdult = findViewById<CheckBox>(R.id.isAdult)
        val btLoad = findViewById<Button>(R.id.btLoad)
        val btSave = findViewById<Button>(R.id.btSave)

        val shareRef = getSharedPreferences("my", Context.MODE_PRIVATE)



        val listener = SharedPreferences.OnSharedPreferenceChangeListener { sharedPreferences, s ->
            Toast.makeText(this,"Values in reference changed",Toast.LENGTH_LONG).show()
        }
        shareRef.registerOnSharedPreferenceChangeListener(listener)
        val editor = shareRef.edit()
        btSave.setOnClickListener {
            val name = etName.text.toString()
            val age = etAge.text.toString().toInt()
            val adult = cbAdult.isChecked
            val list= mutableSetOf(name.toString(),age.toString(),"adult")


            editor.apply {
                putString("name", name)
                putInt("age", age)
                putBoolean("adult", adult)
               // putStringSet("all data",list)
                apply()
            }
        }

        btLoad.setOnClickListener {
            val name = shareRef.getString("name", null)
            val age = shareRef.getInt("age", 0)
            val adult = shareRef.getBoolean("adult", false)
//            val all =shareRef.getStringSet("all data",null)
//            val update =all?.joinToString(",")?.split(",")?.toMutableSet()
//            val updated=update?.add("End")
//            val str=update?.joinToString(",")
//            etName.setText(str)
            etName.setText(name)
            etAge.setText(age.toString())
            cbAdult.isChecked = adult


        }
        val btClear=findViewById<Button>(R.id.btClear)
        btClear.setOnClickListener{
            editor.clear()
            editor.apply()
        }

        val btRemove=findViewById<Button>(R.id.btRemove)
        btRemove.setOnClickListener{
            editor.remove("name")
            editor.apply()
        }

        val check = findViewById<Button>(R.id.btCheck)
        check.setOnClickListener {
            //val checkl=shareRef.contains("name")
            val checkl= shareRef.getBoolean("adut",true)
            Toast.makeText(this, checkl.toString(),Toast.LENGTH_LONG).show()
        }

    }
}
