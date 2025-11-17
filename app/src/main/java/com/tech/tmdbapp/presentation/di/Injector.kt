package com.tech.tmdbapp.presentation.di

import com.tech.tmdbapp.presentation.di.artist.ArtistSubComponent
import com.tech.tmdbapp.presentation.di.movie.MovieSubComponent
import com.tech.tmdbapp.presentation.di.tvshow.TvShowSubComponent

interface Injector {

    fun createMovieSubComponent(): MovieSubComponent

    fun createTvShowComponent(): TvShowSubComponent

    fun createArtistSubComponent(): ArtistSubComponent

}