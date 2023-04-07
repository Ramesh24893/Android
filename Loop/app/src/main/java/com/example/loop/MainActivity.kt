package com.example.loop


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val secActiBut=findViewById<Button>(R.id.secActiBut)
        secActiBut.setOnClickListener {

                var intent = Intent(Intent.ACTION_SEND) // intent
                intent.type = "text/plain"
                intent.putExtra(Intent.EXTRA_EMAIL, "niranjantest@gmail.com")
                intent.putExtra(Intent.EXTRA_SUBJECT, "This is a dummy message")
                intent.putExtra(Intent.EXTRA_TEXT, "Dummy test message")
                startActivity(intent)
            }

        }
    } 
