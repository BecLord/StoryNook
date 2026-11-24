package com.example.storynook.data


import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface ReadingChallengeDao {
    @Query("SELECT * FROM ReadingChallenge")
    fun getAllReadingChallenges(): Flow<List<ReadingChallenge>>
    @Query("SELECT * FROM ReadingChallenge WHERE challengeID = :id")
    fun getReadingChallengeById(id: Int): ReadingChallenge

    @Insert
    suspend fun insertReadingChallenge(readingChallenge: ReadingChallenge)
    @Update
    suspend fun updateReadingChallenge(readingChallenge: ReadingChallenge)
    @Delete
    suspend fun deleteReadingChallenge(readingChallenge: ReadingChallenge)
}