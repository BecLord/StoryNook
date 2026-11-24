package com.example.storynook.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface CircleMembersDao {
    @Query("SELECT * FROM CircleMembers")
    fun getAllCircleMembers(): Flow<List<CircleMembers>>

    @Query("SELECT * FROM CircleMembers WHERE circleMemberID = :id")
    fun getCircleMemberById(id: Int): CircleMembers

    @Insert
    suspend fun insertCircleMember(circleMember: CircleMembers)

    @Update
    suspend fun updateCircleMember(circleMember: CircleMembers)

    @Delete
    suspend fun deleteCircleMember(circleMember: CircleMembers)
}