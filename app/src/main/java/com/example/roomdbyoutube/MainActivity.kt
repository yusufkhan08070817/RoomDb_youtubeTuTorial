package com.example.roomdbyoutube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.room.Room
import com.example.roomdbyoutube.Room.Tabaleschama
import com.example.roomdbyoutube.Room.tabaledatabase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val display:TextView=findViewById(R.id.display)

       val db=Room.databaseBuilder(applicationContext
           ,tabaledatabase::class.java
           ,"about")
           .build()
        GlobalScope.launch {
            db.getaccess().
            Insertdata(
                Tabaleschama
                    (name = "yusuf", age = 23))
        }

    }
}