package com.example.storynook.data

import kotlinx.serialization.Serializable

@Serializable
data class Book (
    val bookID: Int,
    val title: String,
    val author: String,
    val genre: String,
    val coverImage: String,
    val description: String,
    val pageCount: Int,
    val publicationDate: String,
    val ratingcount: Int
)