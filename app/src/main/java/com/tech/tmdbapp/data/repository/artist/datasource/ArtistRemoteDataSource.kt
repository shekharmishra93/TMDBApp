package com.tech.tmdbapp.data.repository.artist.datasource

import com.tech.tmdbapp.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDataSource {
    suspend fun getArtists(): Response<ArtistList>
}