package com.example.storynook.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "UserBooks")

data class UserBooks(
    @PrimaryKey(autoGenerate = true)
    val userBookID: Int,
    val userID: Int,
    val bookID: Int,
    val readingStatus: String,
    val currentPage: Int,
    val rating: Int,
    val review: String,
    val dateStarted: String,
    val dateFinished: String,
    val countsTowardsChallenge: Boolean
)
