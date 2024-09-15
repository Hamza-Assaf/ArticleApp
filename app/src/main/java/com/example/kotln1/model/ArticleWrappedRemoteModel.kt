package com.example.kotln1.model

data class ArticleWrappedRemoteModel (

   private val status : String,

    private val totalResults : Int,

    val articles : List<ArticleRemoteModel>

)
