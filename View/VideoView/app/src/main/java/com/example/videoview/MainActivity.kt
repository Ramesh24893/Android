package com.example.videoview

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore.Audio.Media
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import java.io.InputStream

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoView=findViewById<VideoView>(R.id.videoView)
       val mediaController=MediaController(this)
        mediaController.setAnchorView(videoView)

        val onlineUri = Uri.parse("https://mazwai.com/videvo_files/video/free/2018-01/small_watermarked/171124_H1_005_preview.webm")
        val offlineUri= Uri.parse("android.resource://$packageName/${R.raw.nature}")
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(offlineUri)
        videoView.requestFocus()

        videoView.start()
        videoView.setOnCompletionListener {
//            Toast.makeText(getApplicationContext(),
//                "Thanks for watching!", Toast.LENGTH_LONG).show();
            Toast.makeText(this,"Thanks for watching!",Toast.LENGTH_LONG).show();
        }
        videoView.setOnErrorListener { mediaController, i, i2 ->
                Toast.makeText(applicationContext,"Error Occured",Toast.LENGTH_LONG).show()
            false
        }

    }
}