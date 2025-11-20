package com.tech.tmdbapp.presentation.di.artist

import com.tech.tmdbapp.domain.usecase.GetArtistsUseCase
import com.tech.tmdbapp.domain.usecase.UpdateArtistUseCase
import com.tech.tmdbapp.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped


@InstallIn(ActivityComponent::class)
@Module
class ArtistModule {

    @ActivityScoped
    @Provides
    fun providesArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistUseCase: UpdateArtistUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(getArtistsUseCase, updateArtistUseCase)
    }
}