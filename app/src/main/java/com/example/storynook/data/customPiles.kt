package com.example.storynook.data

import kotlinx.serialization.Serializable

@Serializable
data class customPiles(
    val userID: Int,
    val bookID: Int,
    val pileID: Int,
    val pileName: String,
    val description: String,
    val date: String
)