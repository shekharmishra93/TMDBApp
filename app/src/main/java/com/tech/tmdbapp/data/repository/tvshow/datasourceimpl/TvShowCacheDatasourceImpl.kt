package com.tech.tmdbapp.data.repository.tvshow.datasourceimpl

import com.tech.tmdbapp.data.model.tvshow.TvShow
import com.tech.tmdbapp.data.repository.tvshow.datasource.TvShowCacheDataSource

class TvShowCacheDatasourceImpl() : TvShowCacheDataSource {

    private var tvShowsList = ArrayList<TvShow>()
    override suspend fun getTvShowsFromCache(): List<TvShow> {
        return tvShowsList
    }

    override suspend fun saveTvShowsToCache(tvShow: List<TvShow>) {
        tvShowsList.clear()
        tvShowsList = ArrayList(tvShow)
    }
}