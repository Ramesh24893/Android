package com.example.fitnessapplication.data

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import java.util.*


@Entity(tableName = "users_account",indices = [Index(value = ["email","phoneNumber"], unique = true)])
data class User(
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val name: String,
    var email: String,
    var password: String,
    var phoneNumber : String
    )


@Entity(tableName = "user_metrics")
data class UserMetrics(
    @PrimaryKey
    val userId : Int,
    var weight : Float,
    var age : Int,
    val gender : String,
    var activityId : Int
)
@Entity(tableName = "activity_levels")
data class ActivityLevels(
    @PrimaryKey
    val id : Int,
    val type : String,
    val value : Float
)

@Entity(tableName = "user_daily_activities")
data class UserDailyActivities(
    val userId: Int,
    val waterTaken : Float,
    val steps : Int,
    val dailyCalorieIntake : Int,
    val dailyWeight : Float,
    val date : Date,
    val userGoalID : Int)

@Entity(tableName = "user_goals")
data class UserGoals(
    @PrimaryKey
    val userId : Int,
    val status : String,
    val goalWeight : Float,
    val goalTimePeriod : Int,
    )

@Entity(tableName = "exercises")
data class Exercise(
    val exerciseId : Int,
    val name : String,
    val description : String,
    val met : Float,
)

@Entity(tableName = "users_exercises")
data class UserExercises(
    val userId: Int,
    val exerciseId: Int,
    val date : Date,
    val duration : Float,
    val caloriesBurned : Int,
)

@Entity(tableName = "foods")
data class Foods(
    val id: Int,
    val name : String,
    val quantity : Int,
    val calories : Int,
    val proteins : Int,
    val carbohydrates : Int,
    val fat : Int,
)