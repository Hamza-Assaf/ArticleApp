package com.example.kotln1.di

import com.example.kotln1.dataSource.EverythingDataSource
import com.example.kotln1.repository.ArticleRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    private const val baseUrl = "https://newsapi.org/v2/"

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {

        return Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }

    @Provides
    @Singleton
    fun provideArticleDataSource(retrofit: Retrofit): EverythingDataSource {

        return retrofit.create(EverythingDataSource::class.java)

    }


    @Provides
    @Singleton
    fun provideRepository(everythingDataSource: EverythingDataSource): ArticleRepository {


    return ArticleRepository(everythingDataSource)

}







}