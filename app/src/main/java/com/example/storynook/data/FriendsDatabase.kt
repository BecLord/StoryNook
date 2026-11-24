package com.example.storynook.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Friends::class],
    version = 1,
    exportSchema = true
)

abstract class FriendsDatabase : RoomDatabase() {
    abstract fun FriendsDao(): FriendsDao
}