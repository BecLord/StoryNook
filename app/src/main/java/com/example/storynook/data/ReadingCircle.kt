package com.example.storynook.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ReadingCircle")

data class ReadingCircle(
    @PrimaryKey(autoGenerate = true)
    val circleID: Int,
    val name: String,
    val description: String,
    val topic: String,
    val currentBookId: Int,
    val members: List<String>,
    val maxMembers: Int,
    val dateCreated: String
)
