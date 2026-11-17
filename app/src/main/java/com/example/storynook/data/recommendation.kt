package com.example.storynook.data

import kotlinx.serialization.Serializable

@Serializable
data class Recommendations(
    val recommendationID: Int,
    val userID: Int,
    val bookID: Int,
    val reason: String,
    val rating: Int,
    val date: String,
    val friendID: Int
)