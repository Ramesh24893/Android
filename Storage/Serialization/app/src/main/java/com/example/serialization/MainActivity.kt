package com.example.serialization

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        @Serializable
        class Project(val name: String, val language: String)

        fun main() {
            val data = Project("kotlinx.serialization", "Kotlin")
            println(Json.encodeToString(data))
        }
    }
}