package com.tech.tmdbapp.presentation

import android.app.Application
import com.tech.tmdbapp.BuildConfig
import com.tech.tmdbapp.presentation.di.Injector
import com.tech.tmdbapp.presentation.di.artist.ArtistSubComponent
import com.tech.tmdbapp.presentation.di.core.AppComponent
import com.tech.tmdbapp.presentation.di.core.AppModule
import com.tech.tmdbapp.presentation.di.core.DaggerAppComponent
import com.tech.tmdbapp.presentation.di.core.NetModule
import com.tech.tmdbapp.presentation.di.core.RemoteDataModule
import com.tech.tmdbapp.presentation.di.movie.MovieSubComponent
import com.tech.tmdbapp.presentation.di.tvshow.TvShowSubComponent

class App : Application(), Injector {

    private lateinit var appComponent: AppComponent


    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent
            .builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY))
            .build()
    }

    override fun createMovieSubComponent(): MovieSubComponent {
        return appComponent.movieSubComponent().create()
    }

    override fun createTvShowComponent(): TvShowSubComponent {
        return appComponent.tvShowSubComponent().create()
    }

    override fun createArtistSubComponent(): ArtistSubComponent {
        return appComponent.artistSubComponent().create()
    }


}