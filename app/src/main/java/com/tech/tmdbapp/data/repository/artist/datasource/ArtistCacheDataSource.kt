package com.tech.tmdbapp.data.repository.artist.datasource

import com.tech.tmdbapp.data.model.artist.Artist

interface ArtistCacheDataSource {

    suspend fun getArtistsFromCache(): List<Artist>

    suspend fun saveArtistToCache(artist: List<Artist>)


}