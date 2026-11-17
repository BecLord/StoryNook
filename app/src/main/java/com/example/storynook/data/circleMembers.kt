package com.example.storynook.data

import kotlinx.serialization.Serializable

@Serializable
data class CircleMembers(
    val circleID: Int,
    val userID: Int,
    val role: String,
)