package com.tech.tmdbapp.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.tech.tmdbapp.domain.usecase.GetArtistsUseCase
import com.tech.tmdbapp.domain.usecase.UpdateArtistUseCase

@Suppress("UNCHECKED_CAST")
class ArtistViewModelFactory(
    private val getArtistsUseCase: GetArtistsUseCase,
    private val updateArtistUseCase: UpdateArtistUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        return ArtistViewModel(getArtistsUseCase, updateArtistUseCase) as T
    }
}