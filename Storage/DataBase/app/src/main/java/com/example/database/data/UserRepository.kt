package com.example.database.data

import android.util.Log
import androidx.lifecycle.LiveData

class UserRepository(private val userDao: UserDao) {

    val readAllData : LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user : User){
        Log.e("TAG"," UR addd UUSSSERR")
        userDao.addUser(user)
    }
}