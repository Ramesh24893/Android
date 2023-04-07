package com.example.fragmentbottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentbottomnavigation.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        setContentView(R.layout.activity_main)


        findViewById<BottomNavigationView>(R.id.bottomNavigationView)
    }
}