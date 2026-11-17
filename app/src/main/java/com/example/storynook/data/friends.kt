package com.example.storynook.data

import kotlinx.serialization.Serializable

@Serializable
data class Friends(
    val userID: Int,
    val friendID: Int,
)