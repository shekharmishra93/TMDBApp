package com.tech.tmdbapp.data.repository

import com.tech.tmdbapp.data.db.MovieDao
import com.tech.tmdbapp.data.model.movie.Movie

class MovieLocalDataSourceImpl(private val movieDao: MovieDao) : MovieLocalDataSource {

    override suspend fun getMoviesFromDB(): List<Movie> {
        return movieDao.getAllMovies()
    }

    override suspend fun saveMoviesToDB(movies: List<Movie>) {
        TODO("Not yet implemented")
    }

    override suspend fun clearAll() {
        TODO("Not yet implemented")
    }
}