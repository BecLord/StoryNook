package com.example.storynook.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ReadingChallenge")

data class ReadingChallenge(
    @PrimaryKey(autoGenerate = true)
    val challengeID: Int,
    val userID: Int,
    val bookID: Int,
    val title: String,
    val target: Int,
    val startDate: String,
    val endDate: String,
    val progress: Int
)
