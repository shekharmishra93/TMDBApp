package com.tech.tmdbapp.presentation.di.core

import com.tech.tmdbapp.data.repository.artist.datasource.ArtistCacheDataSource
import com.tech.tmdbapp.data.repository.artist.datasourceimpl.ArtistCacheDatasourceImpl
import com.tech.tmdbapp.data.repository.movie.datasource.MovieCacheDataSource
import com.tech.tmdbapp.data.repository.movie.datasourceimpl.MovieCacheDatasourceImpl
import com.tech.tmdbapp.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.tech.tmdbapp.data.repository.tvshow.datasourceimpl.TvShowCacheDatasourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {

    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDatasourceImpl()
    }

    @Singleton
    @Provides
    fun provideTvShowCacheDataSource(): TvShowCacheDataSource {
        return TvShowCacheDatasourceImpl()
    }

    @Singleton
    @Provides
    fun provideArtistCacheDataSource(): ArtistCacheDataSource {
        return ArtistCacheDatasourceImpl()
    }

}