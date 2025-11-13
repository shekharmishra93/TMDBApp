package com.tech.tmdbapp.data.repository

import com.tech.tmdbapp.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {
    suspend fun getMovies(): Response<MovieList>
}