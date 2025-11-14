package com.tech.tmdbapp.data.repository.artist.datasourceimpl

import com.tech.tmdbapp.data.model.artist.Artist
import com.tech.tmdbapp.data.repository.artist.datasource.ArtistCacheDataSource

class ArtistCacheDatasourceImpl() : ArtistCacheDataSource {

    private var artistList = ArrayList<Artist>()

    override suspend fun getArtistsFromCache(): List<Artist> {
        return artistList
    }

    override suspend fun saveArtistToCache(artist: List<Artist>) {
        artistList.clear()
        artistList = ArrayList(artist)
    }
}