package com.tech.tmdbapp.presentation.di.core

import com.tech.tmdbapp.data.db.ArtistDao
import com.tech.tmdbapp.data.db.MovieDao
import com.tech.tmdbapp.data.db.TvShowDao
import com.tech.tmdbapp.data.repository.artist.datasource.ArtistLocalDataSource
import com.tech.tmdbapp.data.repository.artist.datasourceimpl.ArtistLocalDataSourceImpl
import com.tech.tmdbapp.data.repository.movie.datasource.MovieLocalDataSource
import com.tech.tmdbapp.data.repository.movie.datasourceimpl.MovieLocalDataSourceImpl
import com.tech.tmdbapp.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.tech.tmdbapp.data.repository.tvshow.datasourceimpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao): MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDao)
    }


    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao): TvShowLocalDataSource {
        return TvShowLocalDataSourceImpl(tvShowDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao: ArtistDao): ArtistLocalDataSource {
        return ArtistLocalDataSourceImpl(artistDao)
    }

}