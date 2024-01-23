package com.example.roomdbyoutube.Room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

    @Dao
    interface TabaleDao {
    @Insert
    suspend fun Insertdata(data:Tabaleschama)
    @Update
    suspend fun Updatedata(data:Tabaleschama)
    @Delete
    suspend fun Deletedata(data:Tabaleschama)
    @Query("SELECT *FROM NAMGEAGE")
    fun getdata():LiveData<List<Tabaleschama>>
        }