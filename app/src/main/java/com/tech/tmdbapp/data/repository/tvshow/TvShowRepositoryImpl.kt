package com.tech.tmdbapp.data.repository.tvshow

import com.tech.tmdbapp.data.model.tvshow.TvShow
import com.tech.tmdbapp.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.tech.tmdbapp.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.tech.tmdbapp.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.tech.tmdbapp.domain.repository.TvShowRepository

class TvShowRepositoryImpl(
    private val tvShowRemoteDataSource: TvShowRemoteDataSource,
    private val tvShowLocalDataSource: TvShowLocalDataSource,
    private val tvShowCacheDataSource: TvShowCacheDataSource
) : TvShowRepository {

    override suspend fun getTvShows(): List<TvShow>? {
        TODO("Not yet implemented")
    }

    override suspend fun updateTvShows(): List<TvShow>? {
        TODO("Not yet implemented")
    }
}