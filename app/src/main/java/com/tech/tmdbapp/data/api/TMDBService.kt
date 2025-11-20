package com.tech.tmdbapp.data.api

import com.tech.tmdbapp.data.model.artist.ArtistList
import com.tech.tmdbapp.data.model.movie.MovieList
import com.tech.tmdbapp.data.model.tvshow.TvShowList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBService {
    //sample URL = https://api.themoviedb.org/3/movie/popular?api_key=[your api key]
    /*
    * Base Url = https://api.themoviedb.org/3/
    * End Points = movie/popular
    *Query Parameters = ?api_key=[your api key]
    * */

    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("api_key") apiKey: String): Response<MovieList>

    @GET("tv/popular")
    suspend fun getPopularTvShows(@Query("api_key") apiKey: String): Response<TvShowList>

    @GET("person/popular")
    suspend fun getPopularArtists(@Query("api_key") apiKey: String): Response<ArtistList>


}