package com.example.onetoonerelationship

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Owner(@PrimaryKey val ownerId: Long?, val name: String?)
