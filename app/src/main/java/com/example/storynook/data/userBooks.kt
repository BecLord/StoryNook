package com.example.storynook.data

import kotlinx.serialization.Serializable

@Serializable
data class UserBooks(
    val userBookID: Int,
    val userID: Int,
    val bookID: Int,
    val readingStatus: String,
    val currentPage: Int,
    val rating: Int,
    val review: String,
    val dateStarted: String,
    val dateFinished: String
)
