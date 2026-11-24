package com.example.storynook.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "CircleMembers")

data class CircleMembers(
    @PrimaryKey(autoGenerate = true)
    val circleMemberID: Int,
    val circleID: Int,
    val userID: Int,
    val dateJoined: String
)
