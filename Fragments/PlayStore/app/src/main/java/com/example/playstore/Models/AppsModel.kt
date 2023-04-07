package com.example.playstore.Models

import com.example.playstore.R

data class AppsModel( val appImage:Int,
val appName: String,
val appRating: Float,
val icon: Int){

    companion object{
        fun getData():ArrayList<AppsModel>{
            val appsList= arrayListOf<AppsModel>(
                AppsModel(R.drawable.spotify,"Spotify",4.8f, R.drawable.rating),

               AppsModel(R.drawable.snapchat,"SnapChat",3.0f, R.drawable.rating),

            AppsModel(R.drawable.instagram,"Instagram",4.4f, R.drawable.rating),
            AppsModel(R.drawable.zomato,"Linkedin",4.5f, R.drawable.rating),
            AppsModel(R.drawable.amazon,"Amazon",3.6f, R.drawable.rating),
            AppsModel(R.drawable.hotstar,"HotStar",4.0f, R.drawable.rating),
            AppsModel(R.drawable.logo_twitter,"Twitter",4.1f, R.drawable.rating),
                AppsModel(R.drawable.logowhatsapp,"Whatsapp",4.0f, R.drawable.rating),
                        AppsModel(R.drawable.facebook,"FaceBook",3.5f, R.drawable.rating),

            )


            return appsList
        }
    }
}




