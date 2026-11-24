package com.example.storynook.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Friends")

data class Friends(
    @PrimaryKey(autoGenerate = true)
    val friendID: Int,
    val userID: Int,
)
