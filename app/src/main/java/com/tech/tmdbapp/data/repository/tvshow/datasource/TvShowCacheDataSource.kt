package com.tech.tmdbapp.data.repository.tvshow.datasource

import com.tech.tmdbapp.data.model.tvshow.TvShow

interface TvShowCacheDataSource {

    suspend fun getTvShowsFromCache(): List<TvShow>

    suspend fun saveTvShowsToCache(tvShow: List<TvShow>)


}