package com.tech.tmdbapp.presentation.di.tvshow

import com.tech.tmdbapp.domain.usecase.GetTvShowsUseCase
import com.tech.tmdbapp.domain.usecase.UpdateTvShowUseCase
import com.tech.tmdbapp.presentation.di.movie.MovieScope
import com.tech.tmdbapp.presentation.tvshows.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {

    @TvShowScope
    @Provides
    fun providesTvShowViewModelFactory(
        getTvShowUseCase: GetTvShowsUseCase,
        updateTvShowUseCase: UpdateTvShowUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(getTvShowUseCase, updateTvShowUseCase)
    }
}