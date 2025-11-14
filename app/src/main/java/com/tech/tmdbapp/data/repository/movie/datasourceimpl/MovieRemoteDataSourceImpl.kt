package com.tech.tmdbapp.data.repository.movie.datasourceimpl

import com.tech.tmdbapp.data.api.TMDBService
import com.tech.tmdbapp.data.model.movie.MovieList
import com.tech.tmdbapp.data.repository.movie.datasource.MovieRemoteDataSource
import retrofit2.Response

class MovieRemoteDataSourceImpl(private val tmdbService: TMDBService, private val apiKey: String) :
    MovieRemoteDataSource {
    override suspend fun getMovies(): Response<MovieList> {
        return tmdbService.getPopularMovies(apiKey)
    }
}