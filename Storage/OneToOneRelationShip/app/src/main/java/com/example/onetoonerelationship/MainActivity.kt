package com.example.onetoonerelationship

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appDb = ApplicationDatabase.getDatabase(this)

        val dog1=Dog(1,101,"Pat1")
        val dog2=Dog(2,102,"Pat2")
        val dog3=Dog(3,103,"Pat3")
        val dog4=Dog(4,104,"Pat4")
        val dog5=Dog(5,105,"Pat5")

        val owner1=Owner(101,"Owner1")
        val owner2=Owner(102,"Owner2")
        val owner3=Owner(103,"Owner3")
        val owner4=Owner(104,"Owner4")
        val owner5=Owner(105,"Owner5")
        val listDog = arrayListOf(dog1,dog2,dog3,dog4,dog5)

        GlobalScope.launch(Dispatchers.IO) {

            appDb.appDao().insert(dog1)
            appDb.appDao().insert(dog2)
            appDb.appDao().insert(dog3)
            appDb.appDao().insert(dog4)
            appDb.appDao().insert(dog5)


            //val listOwner = arrayListOf(owner1,owner2,owner3,owner4,owner5)
            appDb.appDao().insert(owner1)
            appDb.appDao().insert(owner2)
            appDb.appDao().insert(owner3)
            appDb.appDao().insert(owner4)
          appDb.appDao().insert(owner5)


        }
        GlobalScope.launch(Dispatchers.IO) {
            val dogAndOwner=appDb.appDao().getDogsAndOwners()
            dogAndOwner.forEach{
                Log.e("TAG","$it")
            }
        }
    }
}