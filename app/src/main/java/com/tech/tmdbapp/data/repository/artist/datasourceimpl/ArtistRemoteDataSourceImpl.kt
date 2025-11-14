package com.tech.tmdbapp.data.repository.artist.datasourceimpl

import com.tech.tmdbapp.data.api.TMDBService
import com.tech.tmdbapp.data.model.artist.ArtistList
import com.tech.tmdbapp.data.repository.artist.datasource.ArtistRemoteDataSource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(private val tmdbService: TMDBService, private val apiKey: String) :
    ArtistRemoteDataSource {
    override suspend fun getArtists(): Response<ArtistList> {
        return tmdbService.getPopularArtists(apiKey)
    }
}