package com.example.storynook.data

import kotlinx.serialization.Serializable

@Serializable
data class Reviews(
    val reviewID: Int,
    val userID: Int,
    val bookID: Int,
    val rating: Int,
    val reviewText: String,
    val date: String
)