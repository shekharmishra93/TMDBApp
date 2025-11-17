package com.tech.tmdbapp.presentation.di.tvshow

import dagger.Subcomponent

@TvShowScope
@Subcomponent(modules = [TvShowModule::class])
interface TvShowSubComponent {
    fun inject(tvShowSubComponent: TvShowSubComponent)

    @Subcomponent.Factory
    interface Factory {
        fun create(): TvShowSubComponent
    }
}