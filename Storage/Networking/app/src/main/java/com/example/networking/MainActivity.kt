package com.example.networking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.json.JSONObject
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        GlobalScope.launch(Dispatchers.IO) {
//            val url = URL("https://dogapi.dog/docs/api-v2")
//            val connection = url.openConnection() as HttpURLConnection
//            connection.requestMethod = "GET"
//            val responseCode = connection.responseCode
//            println("Response code: $responseCode")
//            val content = connection.inputStream.bufferedReader().readText()
//            println("Content: $content")
//            connection.disconnect()

           // val url = URL("https://dogapi.dog/docs/api-v2")

           // val url = URL("https://api.npoint.io/8d8df57b1acc46aeb49d")

//           val url = URL()

//            val url = URL("https://firebase.google.com/")
            val url = URL("https://urumee.com/admin/dashboard")



            val connection = url.openConnection() as HttpURLConnection
            connection.requestMethod = "POST"

// Set headers
            connection.setRequestProperty("Content-Type", "application/json")
            connection.setRequestProperty("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoxOSwiaWF0IjoxNjc5NDkxODk0LCJleHAiOjE2ODIwODM4OTR9.WQwMIOnrPCh8N2lzqh0-ezDf-8rZXmxA61F5yda-fsA")

// Create body data
            val bodyData = JSONObject()
            bodyData.put("offset", 0)
            bodyData.put("limit", 1)
            bodyData.put("model", "User")

// Write body data to connection output stream
            connection.doOutput = true
            val outputStream = connection.outputStream
            val body = bodyData.toString().toByteArray(Charsets.UTF_8)
            outputStream.write(body)
            outputStream.flush()
            outputStream.close()
//            connection.apply {
//               // connectTimeout = 10000 // 10 seconds
//                requestMethod = "POST"
//                doInput = true
//
//            }


            val responseCode = connection.responseCode
            Log.e("TAG",responseCode.toString())
//            if (responseCode == HttpURLConnection.HTTP_OK) { // If the response code is 200 OK
                val inputStream = connection.inputStream
               // val jsonResponse = PersistableBundle.readFromStream(inputStream)

//                val response = inputStream.bufferedReader().use { it.readText() }
//    Log.e("TAG",jsonResponse.toString())
//
////                val jsonResponse = JSONObject(response)
////                println(jsonResponse.toString(2))
//                println(response) // Print the response body

                val reader = BufferedReader(InputStreamReader(inputStream))
                var line : String?
                var response = ""
                while (reader.readLine().also
                    { line = it } != null) {
                    Log.e("TAG", line!!)
                    response += line
                }
                //reader.close()
              val jsonResponse = JSONObject(response)
           val arrayObj = jsonResponse.getJSONObject("data")
            val arrayOb = arrayObj.getJSONArray("result")
//
                arrayOb.let { Log.e("TAG", it.toString()) }
                //response.let { Log.e("TAG", it.toString()) }
               // println(response.toString())
//            } else {
//                println("Request failed with response code $")
//            }

            connection.disconnect()
        }
    }
}