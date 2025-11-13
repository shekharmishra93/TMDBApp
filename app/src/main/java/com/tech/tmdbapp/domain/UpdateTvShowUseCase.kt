package com.tech.tmdbapp.domain

import com.tech.tmdbapp.data.model.tvshow.TvShow

class UpdateTvShowUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute(): List<TvShow>? = tvShowRepository.updateTvShows()
}