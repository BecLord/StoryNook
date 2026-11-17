package com.example.storynook.data

import kotlinx.serialization.Serializable

@Serializable
data class ReadingCircle(
    val circleID: Int,
    val name: String,
    val description: String,
    val members: List<String>,
    val maxMembers: Int,
    val dateCreated: String
)
