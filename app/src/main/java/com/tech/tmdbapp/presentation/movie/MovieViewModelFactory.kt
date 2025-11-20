package com.tech.tmdbapp.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.tech.tmdbapp.domain.usecase.GetMoviesUseCase
import com.tech.tmdbapp.domain.usecase.UpdateMoviesUseCase

@Suppress("UNCHECKED_CAST")
class MovieViewModelFactory(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUseCase: UpdateMoviesUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        return MovieViewModel(getMoviesUseCase, updateMoviesUseCase) as T
    }
}