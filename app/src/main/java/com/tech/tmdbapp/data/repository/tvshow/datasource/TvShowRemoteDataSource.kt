package com.tech.tmdbapp.data.repository.tvshow.datasource

import com.tech.tmdbapp.data.model.tvshow.TvShow
import com.tech.tmdbapp.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDataSource {
    suspend fun getTvShows(): Response<TvShowList>
}