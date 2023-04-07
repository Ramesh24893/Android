package com.example.database.data

import android.app.Application
import android.util.Log
import android.view.View
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserViewModel(application: Application): AndroidViewModel(application) {

    val readAllData : LiveData<List<User>>
    private val repository : UserRepository

    init{
        Log.e("TAG","init   UserViewModel")
        val userDao = UserDataBase.getDataBase(application).userDao()
        repository = UserRepository(userDao)
        readAllData = repository.readAllData

    }

    fun addUser(user : User){
        Log.e("TAG","UserViewModel  addd UUSSSERR")
        viewModelScope.launch(Dispatchers.IO) {
            repository.addUser(user)
        }
    }
}