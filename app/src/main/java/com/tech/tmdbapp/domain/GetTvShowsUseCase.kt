package com.tech.tmdbapp.domain

import com.tech.tmdbapp.data.model.tvshow.TvShow

class GetTvShowsUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute(): List<TvShow>? = tvShowRepository.getTvShows()
}