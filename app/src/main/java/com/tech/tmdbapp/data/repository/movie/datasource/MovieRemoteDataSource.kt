package com.tech.tmdbapp.data.repository.movie.datasource

import com.tech.tmdbapp.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {
    suspend fun getMovies(): Response<MovieList>
}