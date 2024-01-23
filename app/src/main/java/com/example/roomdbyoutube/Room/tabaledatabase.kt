package com.example.roomdbyoutube.Room

import androidx.room.Database
import androidx.room.RoomDatabase

    @Database(
    entities = [Tabaleschama::class],
    version = 1)
    abstract class tabaledatabase
    :RoomDatabase(){
    abstract fun getaccess():TabaleDao
    }