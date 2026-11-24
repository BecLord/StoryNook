package com.example.storynook.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface CustomPilesDao {
    @Query("SELECT * FROM CustomPiles")
    fun getAllCustomPiles(): Flow<List<CustomPiles>>
    @Query("SELECT * FROM CustomPiles WHERE pileID = :id")
    fun getCustomPileById(id: Int): CustomPiles

    @Insert
    suspend fun insertCustomPile(customPile: CustomPiles)
    @Update
    suspend fun updateCustomPile(customPile: CustomPiles)
    @Delete
    suspend fun deleteCustomPile(customPile: CustomPiles)
}
