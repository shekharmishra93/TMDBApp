package com.tech.tmdbapp.presentation.di.core

import com.tech.tmdbapp.domain.repository.ArtistRepository
import com.tech.tmdbapp.domain.repository.MovieRepository
import com.tech.tmdbapp.domain.repository.TvShowRepository
import com.tech.tmdbapp.domain.usecase.GetArtistsUseCase
import com.tech.tmdbapp.domain.usecase.GetMoviesUseCase
import com.tech.tmdbapp.domain.usecase.GetTvShowsUseCase
import com.tech.tmdbapp.domain.usecase.UpdateArtistUseCase
import com.tech.tmdbapp.domain.usecase.UpdateMoviesUseCase
import com.tech.tmdbapp.domain.usecase.UpdateTvShowUseCase
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    //movies
    @Provides
    fun providesGetMovieUseCase(movieRepository: MovieRepository): GetMoviesUseCase {
        return GetMoviesUseCase(movieRepository)
    }

    @Provides
    fun providesUpdateMovieUseCase(movieRepository: MovieRepository): UpdateMoviesUseCase {
        return UpdateMoviesUseCase(movieRepository)
    }

    //tv show
    @Provides
    fun providesGetTvShowUseCase(tvShowRepository: TvShowRepository): GetTvShowsUseCase {
        return GetTvShowsUseCase(tvShowRepository)
    }

    @Provides
    fun providesUpdateTvShowUseCase(tvShowRepository: TvShowRepository): UpdateTvShowUseCase {
        return UpdateTvShowUseCase(tvShowRepository)
    }

    //artist
    @Provides
    fun providesGetArtistUseCase(artistRepository: ArtistRepository): GetArtistsUseCase {
        return GetArtistsUseCase(artistRepository)
    }

    @Provides
    fun providesUpdateArtistUseCase(artistRepository: ArtistRepository): UpdateArtistUseCase {
        return UpdateArtistUseCase(artistRepository)
    }

}