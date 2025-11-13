package com.tech.tmdbapp.data.repository

import com.tech.tmdbapp.data.api.TMDBService
import com.tech.tmdbapp.data.model.movie.MovieList
import retrofit2.Response

class MovieRemoteDataSourceImpl(private val tmdbService: TMDBService, private val apiKey: String) :
    MovieRemoteDataSource {
    override suspend fun getMovies(): Response<MovieList> {
        return tmdbService.getPopularMovies(apiKey)
    }
}