package com.example.storynook.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface ReviewsDao {
    @Query("SELECT * FROM Reviews")
    fun getAllReviews(): Flow<List<Reviews>>
    @Query("SELECT * FROM Reviews WHERE recommendationID = :id")
    fun getReviewById(id: Int): Reviews

    @Insert
    suspend fun insertReview(review: Reviews)
    @Update
    suspend fun updateReview(review: Reviews)
    @Delete
    suspend fun deleteReview(review: Reviews)
}