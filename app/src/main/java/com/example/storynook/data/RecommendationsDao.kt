package com.example.storynook.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface RecommendationsDao {
    @Query("SELECT * FROM recommendations")
    fun getAllRecommendations(): Flow<List<Recommendations>>
    @Query("SELECT * FROM recommendations WHERE recommendationID = :id")
    fun getRecommendationById(id: Int): Recommendations

    @Insert
    suspend fun insertRecommendation(recommendation: Recommendations)
    @Update
    suspend fun updateRecommendation(recommendation: Recommendations)
    @Delete
    suspend fun deleteRecommendation(recommendation: Recommendations)
}
