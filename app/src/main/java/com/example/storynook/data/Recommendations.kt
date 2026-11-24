package com.example.storynook.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Recommendations")

data class Recommendations(
    @PrimaryKey(autoGenerate = true)
    val recommendationID: Int,
    val userID: Int,
    val bookID: Int,
    val reason: String,
    val rating: Int,
    val dateRecommended: String,
    val friendID: Int
)
