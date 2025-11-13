package com.tech.tmdbapp.domain.usecase

import com.tech.tmdbapp.data.model.movie.Movie
import com.tech.tmdbapp.domain.repository.MovieRepository

class GetMoviesUseCase(private val movieRepository: MovieRepository) {

    suspend fun execute(): List<Movie>? = movieRepository.getMovies()
}