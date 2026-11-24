package com.example.storynook.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Reviews::class],
    version = 1,
    exportSchema = true
)

abstract class ReviewsDatabase : RoomDatabase() {
    abstract fun reviewsDao(): ReviewsDao
}
