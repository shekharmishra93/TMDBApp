package com.tech.tmdbapp.presentation.movie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.tech.tmdbapp.R
import com.tech.tmdbapp.databinding.ActivityMovieBinding

class MovieActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMovieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this, R.layout.activity_movie)
    }
}