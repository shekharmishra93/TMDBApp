package com.tech.tmdbapp.presentation.di.core

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.tech.tmdbapp.data.db.ArtistDao
import com.tech.tmdbapp.data.db.MovieDao
import com.tech.tmdbapp.data.db.TMDBDatabase
import com.tech.tmdbapp.data.db.TvShowDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DataBaseModule {

    @Singleton
    @Provides
    fun provideMovieDataBase(app: Application): TMDBDatabase {
        return Room.databaseBuilder(app, TMDBDatabase::class.java, "tmdbclient").build()
    }


    @Singleton
    @Provides
    fun provideMovieDao(tmdbDatabase: TMDBDatabase): MovieDao {
        return tmdbDatabase.movieDao()
    }

    @Singleton
    @Provides
    fun provideTvShowDao(tmdbDatabase: TMDBDatabase): TvShowDao {
        return tmdbDatabase.tvShowDao()
    }

    @Singleton
    @Provides
    fun provideArtistDao(tmdbDatabase: TMDBDatabase): ArtistDao {
        return tmdbDatabase.artistDao()
    }

}