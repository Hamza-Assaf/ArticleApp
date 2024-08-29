package com.example.kotln1.api


import com.example.kotln1.data.ResponseModel
import retrofit2.Call

import retrofit2.http.GET
import retrofit2.http.Query

interface APIInterface {


    @GET("top-headlines")
    fun getLatestNews(@Query("sources") source: String?, @Query("apiKey") apiKey: String?): Call<ResponseModel>












}