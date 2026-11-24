package com.example.storynook.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [ReadingChallenge::class, Recommendations::class, Friends::class, CustomPiles::class],
    version = 1,
    exportSchema = true
)

abstract class CustomPileDatabase : RoomDatabase() {
    abstract fun CustomPilesDao(): CustomPilesDao
}