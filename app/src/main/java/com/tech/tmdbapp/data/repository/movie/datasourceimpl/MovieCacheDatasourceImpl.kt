package com.tech.tmdbapp.data.repository.movie.datasourceimpl

import com.tech.tmdbapp.data.model.movie.Movie
import com.tech.tmdbapp.data.repository.movie.datasource.MovieCacheDataSource

class MovieCacheDatasourceImpl() : MovieCacheDataSource {

    private var movieList = ArrayList<Movie>()

    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
        movieList.clear()
        movieList = ArrayList(movies)
    }
}