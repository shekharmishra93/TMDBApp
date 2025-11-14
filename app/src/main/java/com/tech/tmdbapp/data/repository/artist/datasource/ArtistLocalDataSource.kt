package com.tech.tmdbapp.data.repository.artist.datasource

import com.tech.tmdbapp.data.model.artist.Artist

interface ArtistLocalDataSource {

    suspend fun getArtistsFromDB(): List<Artist>

    suspend fun saveArtistsToDB(artist: List<Artist>)

    suspend fun clearAll()
}