package com.example.kotln1.data

import com.google.gson.annotations.SerializedName

class ResponseModel {



    @SerializedName("status")
    private  lateinit var status: String

    @SerializedName("totalResults")
    private var totalResults: Int? = null

    @SerializedName("articles")
    private  lateinit var articles: List<Article>


        fun getStatus(): String {
            return status
        }

         fun getTotalResults(): Int? {
            return totalResults
        }

        fun getArticles(): List<Article> {
            return articles
        }

        fun setStatus(status: String) {
            this.status = status
        }

        fun setTotalResults(totalResults: Int) {
            this.totalResults = totalResults
        }

        fun setArticles(articles: List<Article>) {
            this.articles = articles
        }






}