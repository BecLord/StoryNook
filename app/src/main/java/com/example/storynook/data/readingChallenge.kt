package com.example.storynook.data

import kotlinx.serialization.Serializable

@Serializable
data class ReadingChallenge(
    val challengeID: Int,
    val userID: Int,
    val bookID: Int,
    val title: String,
    val target: Int,
    val startDate: String,
    val endDate: String,
    val progress: Int
)