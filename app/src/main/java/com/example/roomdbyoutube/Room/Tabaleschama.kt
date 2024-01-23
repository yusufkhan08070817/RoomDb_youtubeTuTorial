package com.example.roomdbyoutube.Room

import androidx.room.Entity
import androidx.room.PrimaryKey

    @Entity(tableName = "namgeage")
    data class Tabaleschama(
   @PrimaryKey(autoGenerate = true)
   val id:Long=0,
    val name:String,
    val age:Int
     )
