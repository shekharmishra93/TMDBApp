package com.tech.tmdbapp.presentation

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import com.tech.tmdbapp.R
import com.tech.tmdbapp.databinding.ActivityHomeBinding
import com.tech.tmdbapp.presentation.artist.ArtistActivity
import com.tech.tmdbapp.presentation.movie.MovieActivity
import com.tech.tmdbapp.presentation.tvshows.TvShowActivity

class HomeActivity : ComponentActivity() {

    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)

        binding.btnMovies.setOnClickListener {
            val intent = Intent(this, MovieActivity::class.java)
            startActivity(intent)
        }

        binding.btnTvShows.setOnClickListener {
            val intent2 = Intent(this, TvShowActivity::class.java)
            startActivity(intent2)
        }

        binding.btnArtists.setOnClickListener {
            val intent2 = Intent(this, ArtistActivity::class.java)
            startActivity(intent2)
        }
    }
}