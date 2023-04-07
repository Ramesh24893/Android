package com.example.onetoonerelationship

import androidx.room.*
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction

@Dao
interface DataBaseDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(dog: Dog)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(dog: Owner)

    @Delete
    suspend fun delete(owner: Owner)

    @Transaction
    @Query("SELECT * FROM Owner")
     fun getDogsAndOwners(): List<DogAndOwner>



}