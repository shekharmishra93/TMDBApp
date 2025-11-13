package com.tech.tmdbapp.domain.repository

import com.tech.tmdbapp.data.model.artist.Artist

interface ArtistRepository {

    suspend fun getArtists(): List<Artist>?

    suspend fun updateArtists(): List<Artist>?

}