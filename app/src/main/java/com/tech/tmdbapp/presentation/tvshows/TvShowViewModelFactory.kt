package com.tech.tmdbapp.presentation.tvshows

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.tech.tmdbapp.domain.usecase.GetTvShowsUseCase
import com.tech.tmdbapp.domain.usecase.UpdateTvShowUseCase
import com.tech.tmdbapp.presentation.artist.ArtistViewModel

class TvShowViewModelFactory(
    private val getTvShowsUseCase: GetTvShowsUseCase,
    private val updateTvShowUseCase: UpdateTvShowUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        return TvShowViewModel(getTvShowsUseCase, updateTvShowUseCase) as T
    }
}