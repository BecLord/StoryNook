package com.example.storynook.data

import android.media.Image
import kotlinx.serialization.Serializable

@Serializable
data class Books(
    val bookID: Int,
    val title: String,
    val author: String,
    val genre: String,
    val coverImage: Image,
    val description: String,
    val pageCount: Int
)