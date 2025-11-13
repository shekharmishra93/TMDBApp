package com.tech.tmdbapp.domain.usecase

import com.tech.tmdbapp.data.model.tvshow.TvShow
import com.tech.tmdbapp.domain.repository.TvShowRepository

class UpdateTvShowUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute(): List<TvShow>? = tvShowRepository.updateTvShows()
}