package com.tech.tmdbapp.data.repository

import com.tech.tmdbapp.data.model.movie.Movie

interface MovieLocalDataSource {

    suspend fun getMoviesFromDB(): List<Movie>

    suspend fun saveMoviesToDB(movies: List<Movie>)

    suspend fun clearAll()
}