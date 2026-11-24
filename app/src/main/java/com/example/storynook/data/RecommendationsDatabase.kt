package com.example.storynook.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Recommendations::class],
    version = 1,
    exportSchema = true
)

abstract class RecommendationsDatabase : RoomDatabase() {
    abstract fun recommendationsDao(): RecommendationsDao
}