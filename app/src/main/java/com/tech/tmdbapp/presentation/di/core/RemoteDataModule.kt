package com.tech.tmdbapp.presentation.di.core

import com.tech.tmdbapp.BuildConfig
import com.tech.tmdbapp.data.api.TMDBService
import com.tech.tmdbapp.data.repository.artist.datasource.ArtistRemoteDataSource
import com.tech.tmdbapp.data.repository.artist.datasourceimpl.ArtistRemoteDataSourceImpl
import com.tech.tmdbapp.data.repository.movie.datasource.MovieRemoteDataSource
import com.tech.tmdbapp.data.repository.movie.datasourceimpl.MovieRemoteDataSourceImpl
import com.tech.tmdbapp.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.tech.tmdbapp.data.repository.tvshow.datasourceimpl.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RemoteDataModule() {

    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDataSource {
        return MovieRemoteDataSourceImpl(tmdbService, BuildConfig.API_KEY)
    }


    @Singleton
    @Provides
    fun provideTvShowRemoteDataSource(tmdbService: TMDBService): TvShowRemoteDataSource {
        return TvShowRemoteDataSourceImpl(tmdbService, BuildConfig.API_KEY)
    }

    @Singleton
    @Provides
    fun provideArtistRemoteDataSource(tmdbService: TMDBService): ArtistRemoteDataSource {
        return ArtistRemoteDataSourceImpl(tmdbService, BuildConfig.API_KEY)
    }

}