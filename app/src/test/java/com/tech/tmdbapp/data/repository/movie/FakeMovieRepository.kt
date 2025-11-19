package com.tech.tmdbapp.data.repository.movie

import com.tech.tmdbapp.data.model.movie.Movie
import com.tech.tmdbapp.domain.repository.MovieRepository

class FakeMovieRepository : MovieRepository {

    private val movies = mutableListOf<Movie>()

    init {
        movies.add(Movie(1, "overview1", "pP", "rD1", "title1"))
        movies.add(Movie(2, "overview2", "pP", "rD2", "title2"))
    }

    override suspend fun getMovies(): List<Movie>? {
        return movies
    }

    override suspend fun updateMovies(): List<Movie>? {
        movies.clear()
        movies.add(Movie(3, "overview3", "pP", "rD3", "title3"))
        movies.add(Movie(4, "overview4", "pP", "rD4", "title4"))
        return movies
    }
}