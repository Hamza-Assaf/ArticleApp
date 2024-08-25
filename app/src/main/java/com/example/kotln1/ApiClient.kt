package com.example.kotln1

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {

     private val BASE_URL: String = "https://newsapi.org/v2/"
    private lateinit var  retrofit : Retrofit






     fun  getClient():Retrofit {

          this.retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()

         return this.retrofit
     }









}