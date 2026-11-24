package com.example.storynook.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "CustomPiles")

data class CustomPiles(
    val userID: Int,
    val bookID: Int,
    val pileID: Int,
    val pileName: String,
    val description: String,
    val date: String
)
