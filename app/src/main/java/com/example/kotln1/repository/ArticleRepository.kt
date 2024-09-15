package com.example.kotln1.repository

import com.example.kotln1.dataSource.EverythingDataSource
import com.example.kotln1.model.ArticleWrappedRemoteModel
import javax.inject.Inject

class ArticleRepository @Inject constructor(private val everythingDataSource: EverythingDataSource) {


   suspend fun getArticle(): ArticleWrappedRemoteModel {

        return everythingDataSource.getArticles()
    }

}