package com.example.kotln1.model

data class ArticleRemoteModel (


   private  val source : SourceModel,

    private val author : String,

    private val title : String,

    private val description : String,

    private val url : String,

    private val urlToImage : String,

    private val publishedAt : String,

    private val content : String
)
