package com.example.storynook.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface FriendsDao {
    @Query("SELECT * FROM Friends")
    fun getAllFriends(): Flow<List<Friends>>

    @Query("SELECT * FROM Friends WHERE friendID = :id")
    fun getFriendById(id: Int): Friends

    @Insert
    suspend fun insertFriend(friend: Friends)

    @Update
    suspend fun updateFriend(friend: Friends)

    @Delete
    suspend fun deleteFriend(friend: Friends)

}