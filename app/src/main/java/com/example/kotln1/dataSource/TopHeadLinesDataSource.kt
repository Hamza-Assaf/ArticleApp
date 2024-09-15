package com.example.kotln1.dataSource

import com.example.kotln1.model.ArticleWrappedRemoteModel
import retrofit2.http.GET

interface TopHeadLinesDataSource {


@GET("top-headlines?country=us&apiKey=f391df4c366b4be0b0a7e303c92bd5c4")

suspend fun getArticles(): ArticleWrappedRemoteModel





}