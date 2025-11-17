package com.tech.tmdbapp.presentation.di.core

import com.tech.tmdbapp.data.repository.artist.ArtistRepositoryImpl
import com.tech.tmdbapp.data.repository.artist.datasource.ArtistCacheDataSource
import com.tech.tmdbapp.data.repository.artist.datasource.ArtistLocalDataSource
import com.tech.tmdbapp.data.repository.artist.datasource.ArtistRemoteDataSource
import com.tech.tmdbapp.data.repository.movie.MovieRepositoryImpl
import com.tech.tmdbapp.data.repository.movie.datasource.MovieCacheDataSource
import com.tech.tmdbapp.data.repository.movie.datasource.MovieLocalDataSource
import com.tech.tmdbapp.data.repository.movie.datasource.MovieRemoteDataSource
import com.tech.tmdbapp.data.repository.tvshow.TvShowRepositoryImpl
import com.tech.tmdbapp.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.tech.tmdbapp.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.tech.tmdbapp.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.tech.tmdbapp.domain.repository.ArtistRepository
import com.tech.tmdbapp.domain.repository.MovieRepository
import com.tech.tmdbapp.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideMovieRepository(
        movieRemoteDataSource: MovieRemoteDataSource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {
        return MovieRepositoryImpl(
            movieRemoteDataSource,
            movieLocalDataSource,
            movieCacheDataSource
        )
    }

    @Singleton
    @Provides
    fun provideTvShowRepository(
        tvShowRemoteDataSource: TvShowRemoteDataSource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource
    ): TvShowRepository {
        return TvShowRepositoryImpl(
            tvShowRemoteDataSource,
            tvShowLocalDataSource,
            tvShowCacheDataSource
        )
    }


    @Singleton
    @Provides
    fun provideArtistRepository(
        artistRemoteDataSource: ArtistRemoteDataSource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistRepository {
        return ArtistRepositoryImpl(
            artistRemoteDataSource,
            artistLocalDataSource,
            artistCacheDataSource
        )
    }


}