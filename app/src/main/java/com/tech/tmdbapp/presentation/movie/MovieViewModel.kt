package com.tech.tmdbapp.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.tech.tmdbapp.domain.usecase.GetMoviesUseCase
import com.tech.tmdbapp.domain.usecase.UpdateMoviesUseCase

class MovieViewModel(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUseCase: UpdateMoviesUseCase
) : ViewModel() {


    fun getMovieList() = liveData {
        val movieList = getMoviesUseCase.execute()
        emit(movieList)
    }

    fun updateMovieList() = liveData {
        val movieList = updateMoviesUseCase.execute()
        emit(movieList)
    }

}