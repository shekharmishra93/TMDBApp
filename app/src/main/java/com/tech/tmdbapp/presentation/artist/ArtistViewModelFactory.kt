package com.tech.tmdbapp.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.tech.tmdbapp.domain.usecase.GetMoviesUseCase
import com.tech.tmdbapp.domain.usecase.UpdateMoviesUseCase
import com.tech.tmdbapp.presentation.movie.MovieViewModel

class ArtistViewModelFactory(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUseCase: UpdateMoviesUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        return MovieViewModel(getMoviesUseCase, updateMoviesUseCase) as T
    }
}