package com.tech.tmdbapp.data.repository

import com.tech.tmdbapp.data.model.movie.Movie
import com.tech.tmdbapp.domain.repository.MovieRepository

class MovieRepositoryImpl : MovieRepository {

    override suspend fun getMovies(): List<Movie>? {
        TODO("Not yet implemented")
    }

    override suspend fun updateMovies(): List<Movie>? {
        TODO("Not yet implemented")
    }
}