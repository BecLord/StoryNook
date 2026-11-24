package com.example.storynook.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface UserBooksDao {
    @Query("SELECT * FROM userbooks")
    fun getAllUserBooks(): Flow<List<UserBooks>>
    @Query("SELECT * FROM userbooks WHERE userBookID = :id")
    fun getUserBookById(id: Int): UserBooks?

    @Insert
    suspend fun insertUserBook(userBook: UserBooks)

    @Update
    suspend fun updateUserBook(userBook: UserBooks)

    @Delete
    suspend fun deleteUserBook(userBook: UserBooks)
}