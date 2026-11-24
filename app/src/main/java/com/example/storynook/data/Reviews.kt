package com.example.storynook.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Reviews")

data class Reviews(
    @PrimaryKey(autoGenerate = true)
    val recommendationID: Int,
    val userID: Int,
    val bookID: Int,
    val reason: String,
    val rating: Int,
    val date: String,
    val friendID: Int
)
