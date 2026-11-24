package com.example.storynook.data

import android.content.Context
import com.example.storynook.BuildConfig
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.Json

class BookRepository(private val context: Context) {
    suspend fun getBooks(): List<Book> = withContext(Dispatchers.IO) {
        val json = context.assets
            .open("books.json")
            .bufferedReader()
            .use { it.readText() }

        val books = Json.decodeFromString<List<Book>>(json)
        val apiKey = BuildConfig.BOOKS_API_KEY
        books
    }
}