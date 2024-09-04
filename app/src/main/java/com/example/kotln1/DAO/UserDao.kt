package com.example.kotln1.DAO

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.kotln1.Models.User

@Dao
interface UserDao {

    @Query("SELECT * FROM users")
    fun getAll(): List<User>


    @Insert
    fun insertAll(user: User)

    @Update
     fun updatePassword(user: User)

     @Query(" SELECT EXISTS (SELECT 1 FROM users WHERE email = :email) ")
     fun checkEmailExists(email: String): Boolean

     @Query("SELECT EXISTS (SELECT 1 FROM users WHERE email = :email AND password = :password)")
     fun checkCredentials(email: String, password: String): Boolean

     @Query("SELECT * FROM users WHERE email = :email")
     fun findUserByEmail (email: String): User

    //add email argument from forgot password to otp to new password fragment, then check if the password of the email is the same as the new password


}