package com.example.kotln1

import com.google.gson.annotations.SerializedName

class Article {




@SerializedName("source")
private lateinit var source: SourceModel

@SerializedName("author")
private lateinit var author:String
    @SerializedName("title")
    private lateinit var title:String

    @SerializedName("description")
    private lateinit var description:String

    @SerializedName("url")
    private lateinit var url:String

    @SerializedName("urlToImage")
    private lateinit var urlToImage:String

    @SerializedName("publishedAt")
    private lateinit var publishedAt:String


    fun getSource(): SourceModel {
        return source
    }

    fun getAuthor(): String {
        return author
    }

    fun getTitle(): String {
        return title
    }

    fun getDescription(): String {
        return description
    }

    fun getUrl(): String {
        return url
    }

    fun getUrlToImage(): String {
        return urlToImage
    }

    fun getPublishedAt(): String {
        return publishedAt
    }

    fun setSource(source: SourceModel?) {
        this.source = source!!
    }

    fun setAuthor(author: String?) {
        this.author = author!!
    }

    fun setTitle(title: String) {
        this.title = title
    }

    fun setDescription(description: String) {
        this.description = description
    }

    fun setUrl(url: String?) {
        this.url = url!!
    }

    fun setUrlToImage(urlToImage: String?) {
        this.urlToImage = urlToImage!!
    }

    fun setPublishedAt(publishedAt: String) {
        this.publishedAt = publishedAt
    }




}