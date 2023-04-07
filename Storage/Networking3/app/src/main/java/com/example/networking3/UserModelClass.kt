package com.example.networking3


class UserModelClass(
    val id: Int,
    val name: String,
    val email: String,
    val gender: String,
    val weight: Double,
    val height: Int,
    val mobile: String,
    val office: String
)

data class Users(
    val users: ArrayList<UserModelClass>
)

//data class UsersGson(
//    val users: ArrayList<UserModelClassGson>
//)
//
//data class UserModelClassGson(
//    val id: Int,
//    val name: String,
//    val email: String,
//    val gender: String,
//    val weight: Double,
//    val height: Int,
//    val phone: Phone
//)
//
//data class Phone(
//    val mobile: String,
//    val office: String
//)