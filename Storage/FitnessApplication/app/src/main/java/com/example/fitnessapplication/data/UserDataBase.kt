package com.example.fitnessapplication.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [User::class,UserMetrics::class,UserGoals::class,UserFoods::class,Foods::class,Exercise::class,UserExercises::class], exportSchema = false, version = 1)
abstract class UserDataBase : RoomDatabase(){

    abstract fun userDao(): UserDao

    companion object{

        @Volatile
        private var INSTANCE : UserDataBase? = null

        fun getDataBase(context : Context) : UserDataBase {
            val tempInstance = INSTANCE

            if(tempInstance != null){
                return tempInstance
            }

            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserDataBase::class.java,
                    "user_dataBase1"
                ).build()
                INSTANCE=instance
                return instance

            }
        }
    }
}