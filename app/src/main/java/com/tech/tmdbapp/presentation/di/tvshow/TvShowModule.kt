package com.tech.tmdbapp.presentation.di.tvshow

import com.tech.tmdbapp.domain.usecase.GetTvShowsUseCase
import com.tech.tmdbapp.domain.usecase.UpdateTvShowUseCase
import com.tech.tmdbapp.presentation.tvshows.TvShowViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

@InstallIn(ActivityComponent::class)
@Module
class TvShowModule {

    @ActivityScoped
    @Provides
    fun providesTvShowViewModelFactory(
        getTvShowUseCase: GetTvShowsUseCase,
        updateTvShowUseCase: UpdateTvShowUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(getTvShowUseCase, updateTvShowUseCase)
    }
}