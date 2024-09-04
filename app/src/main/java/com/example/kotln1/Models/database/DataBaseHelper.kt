package com.example.kotln1.Models.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.kotln1.DAO.UserDao
import com.example.kotln1.Models.User

@Database(entities = [User::class], version = 1)
abstract class DataBaseHelper : RoomDatabase(){

    abstract fun userDao(): UserDao


}