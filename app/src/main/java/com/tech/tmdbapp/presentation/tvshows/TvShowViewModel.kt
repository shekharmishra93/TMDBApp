package com.tech.tmdbapp.presentation.tvshows

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.tech.tmdbapp.domain.usecase.GetTvShowsUseCase
import com.tech.tmdbapp.domain.usecase.UpdateTvShowUseCase

class TvShowViewModel(
    private val getTvShowsUseCase: GetTvShowsUseCase,
    private val updateTvShowUseCase: UpdateTvShowUseCase
) : ViewModel() {
    fun getTvShowList() = liveData {
        val movieList = getTvShowsUseCase.execute()
        emit(movieList)
    }

    fun updateTvShowList() = liveData {
        val movieList = updateTvShowUseCase.execute()
        emit(movieList)
    }

}