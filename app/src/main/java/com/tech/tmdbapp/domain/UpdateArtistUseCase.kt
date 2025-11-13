package com.tech.tmdbapp.domain

import com.tech.tmdbapp.data.model.artist.Artist

class UpdateArtistUseCase(private val artistRepository: ArtistRepository) {

    suspend fun execute(): List<Artist>? = artistRepository.updateArtists()
}