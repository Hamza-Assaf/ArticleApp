package com.example.kotln1.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity (tableName = "users")
data class User(

    @ColumnInfo(name = "user_name") val userName : String,
    @PrimaryKey  @ColumnInfo(name = "email")  val email : String,
    @ColumnInfo (name = "password") var password : String,


    )
