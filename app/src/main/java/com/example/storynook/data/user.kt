package com.example.storynook.data

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val userID: int,
    val name: String,
    val email: String,
    val password: String
)