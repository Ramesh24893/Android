package com.example.playstore.Models

import com.example.playstore.R

data class AppsChartModel(val position : Int,
val image : Int,
val appName : String,
val category: String,
val rating : Float,
val ratIcon : Int,
val appSize : String){



    companion object{
        fun getData():ArrayList<AppsChartModel>{
            val appsList= arrayListOf<AppsChartModel>(
                AppsChartModel(1,
                    R.drawable.spotify,"Spotify","Action",4.8f,
                    R.drawable.rating,"20 MB"),
                AppsChartModel(2,
                    R.drawable.logowhatsapp,"Whatsapp","Social",4.0f,
                    R.drawable.rating,"50 MB"),
                AppsChartModel(3,
                    R.drawable.logo_twitter,"Twitter","Social",4.1f,
                    R.drawable.rating,"60 MB"),

                AppsChartModel(4,
                    R.drawable.instagram,"Instagram","Social",3.0f,
                    R.drawable.rating,"90 MB"),

                AppsChartModel(5,
                    R.drawable.snapchat,"SnapChat","Social",4.4f,
                    R.drawable.rating,"10 MB"),
                AppsChartModel(6,
                    R.drawable.zomato,"Zomato","Social",4.5f,
                    R.drawable.rating,"20 MB"),
                AppsChartModel(7,
                    R.drawable.amazon,"Amazon","Social",3.6f,
                    R.drawable.rating,"60 MB"),
                AppsChartModel(8,
                    R.drawable.hotstar,"HotStar","Social",4.0f,
                    R.drawable.rating,"30 MB"),

                        AppsChartModel(9,
                R.drawable.facebook,"FaceBook","Social",3.5f,
                R.drawable.rating,"90 MB"),
            )


            return appsList
        }
    }
}
