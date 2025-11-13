package com.tech.tmdbapp.domain.usecase

import com.tech.tmdbapp.data.model.artist.Artist
import com.tech.tmdbapp.domain.repository.ArtistRepository

class UpdateArtistUseCase(private val artistRepository: ArtistRepository) {

    suspend fun execute(): List<Artist>? = artistRepository.updateArtists()
}