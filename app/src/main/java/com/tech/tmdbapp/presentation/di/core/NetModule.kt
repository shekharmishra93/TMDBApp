package com.tech.tmdbapp.presentation.di.core

import com.tech.tmdbapp.BuildConfig
import com.tech.tmdbapp.data.api.TMDBService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
class NetModule() {

    @Singleton
    @Provides
    fun provideRetroFit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


    @Singleton
    @Provides
    fun provideTMDBService(retrofit: Retrofit): TMDBService{
        return retrofit.create(TMDBService::class.java)
    }
}