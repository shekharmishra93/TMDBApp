package com.tech.tmdbapp.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.tech.tmdbapp.domain.usecase.GetArtistsUseCase
import com.tech.tmdbapp.domain.usecase.UpdateArtistUseCase

class ArtistViewModel(
    private val getArtistsUseCase: GetArtistsUseCase,
    private val updateArtistUseCase: UpdateArtistUseCase
) : ViewModel() {


    fun getArtistList() = liveData {
        val artistList = getArtistsUseCase.execute()
        emit(artistList)
    }

    fun updateArtistList() = liveData {
        val artistList = updateArtistUseCase.execute()
        emit(artistList)
    }

}