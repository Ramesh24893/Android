package com.example.onetoonerelationship



import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Dog :: class,Owner :: class], version = 1)
abstract class ApplicationDatabase : RoomDatabase() {

    abstract fun appDao() : DataBaseDao

    companion object{

        @Volatile
        private var INSTANCE : ApplicationDatabase? = null

        fun getDatabase(context: Context): ApplicationDatabase{

            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ApplicationDatabase::class.java,
                    "animal_dataBase"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}