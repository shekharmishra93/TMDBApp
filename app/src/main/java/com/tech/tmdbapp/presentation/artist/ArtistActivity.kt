package com.tech.tmdbapp.presentation.artist

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.tech.tmdbapp.R
import com.tech.tmdbapp.databinding.ActivityArtistBinding

class ArtistActivity : AppCompatActivity() {

    private lateinit var binding: ActivityArtistBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_artist)
    }
}