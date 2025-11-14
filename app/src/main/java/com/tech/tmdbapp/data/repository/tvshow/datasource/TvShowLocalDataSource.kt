package com.tech.tmdbapp.data.repository.tvshow.datasource

import com.tech.tmdbapp.data.model.tvshow.TvShow

interface TvShowLocalDataSource {

    suspend fun getTvShowsFromDB(): List<TvShow>

    suspend fun saveTvShowsToDB(tvShow: List<TvShow>)

    suspend fun clearAll()
}