package com.example.kotln1.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.kotln1.database.dao.UserDao

@Database(entities = [User::class], version = 1)
abstract class DataBaseHelper : RoomDatabase(){

    abstract fun userDao(): UserDao


}