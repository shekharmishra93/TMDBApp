package com.tech.tmdbapp.domain.repository

import com.tech.tmdbapp.data.model.movie.Movie

interface MovieRepository {

    suspend fun getMovies(): List<Movie>?

    suspend fun updateMovies():List<Movie>?
}