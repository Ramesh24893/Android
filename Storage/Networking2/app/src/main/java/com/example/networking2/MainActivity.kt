package com.example.networking2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.*
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        GlobalScope.launch(Dispatchers.IO) {


           val url = URL("https://api.nationalize.io/?name=nathaniel")
         //   val url =URL("https://jsonplaceholder.typicode.com/")

            val connection = url.openConnection() as HttpURLConnection
            connection.requestMethod = "GET"
            val responseCode = connection.responseCode
            //connection.setRequestProperty("Content-Type", "application/json")

            //if (responseCode == HttpURLConnection.HTTP_OK) { // If the response code is 200 OK
                val inputStream = connection.inputStream

            val reader = BufferedReader(InputStreamReader(inputStream))
            var line : String?
            var response = ""
            while (reader.readLine().also
                { line = it } != null) {
                Log.e("TAG",line!!)
                response += line
            }

            Log.e("TAG",response)
        }
    }
}