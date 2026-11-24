package com.example.storynook.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [ReadingChallenge::class],
    version = 1,
    exportSchema = true
)

abstract class ReadingChallengeDatabase : RoomDatabase() {
    abstract fun readingChallengeDao(): ReadingChallengeDao
}