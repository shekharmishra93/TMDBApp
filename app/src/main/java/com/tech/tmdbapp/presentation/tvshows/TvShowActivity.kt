package com.tech.tmdbapp.presentation.tvshows

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.tech.tmdbapp.R
import com.tech.tmdbapp.databinding.ActivityTvShowBinding

class TvShowActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTvShowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_tv_show)


    }
}