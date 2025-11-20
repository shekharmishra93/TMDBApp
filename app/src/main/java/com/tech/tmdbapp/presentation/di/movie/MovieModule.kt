package com.tech.tmdbapp.presentation.di.movie

import com.tech.tmdbapp.domain.usecase.GetMoviesUseCase
import com.tech.tmdbapp.domain.usecase.UpdateMoviesUseCase
import com.tech.tmdbapp.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

@InstallIn(ActivityComponent::class)
@Module
class MovieModule {

    @ActivityScoped
    @Provides
    fun providesMovieViewModelFactory(
        getMovieUseCase: GetMoviesUseCase,
        updateMoviesUseCase: UpdateMoviesUseCase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(getMovieUseCase, updateMoviesUseCase)
    }
}