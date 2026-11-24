package com.example.storynook.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [UserBooks::class],
    version = 1,
    exportSchema = true
)

abstract class UserBooksDatabase : RoomDatabase() {
    abstract fun userBooksDao(): UserBooksDao
}