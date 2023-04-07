package com.example.togglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    lateinit var textState: TextView
    lateinit var tBtBluetooth : ToggleButton
    lateinit var tBtWifi : ToggleButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tBtBluetooth=findViewById(R.id.tBtBluetooth)
        tBtWifi=findViewById(R.id.tBtWifi)
        textState=findViewById(R.id.tvState)
        tBtBluetooth.setOnCheckedChangeListener{ _, isChecked ->
            if(isChecked) textState.text="BLUETOOTH is ON"
            else textState.text="BLUETOOTH is OFF"
        }
        tBtWifi.setOnCheckedChangeListener{ _, isChecked ->
            if(isChecked) textState.text="WIFI is ON"
            else textState.text="WIFI is OFF"
        }
    }
}