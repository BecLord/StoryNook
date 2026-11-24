package com.example.storynook.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [CircleMembers::class],
    version = 1,
    exportSchema = true
)

abstract class CircleMembersDatabase : RoomDatabase() {
    abstract fun circleMembersDao(): CircleMembersDao
}
