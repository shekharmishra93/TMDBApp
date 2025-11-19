package com.tech.tmdbapp.data.db

import android.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.common.truth.Truth
import com.tech.tmdbapp.data.model.movie.Movie
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MovieDaoTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var dao: MovieDao
    private lateinit var database: TMDBDatabase

    @Before
    fun setUp() {
        database = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            TMDBDatabase::class.java
        ).build()
        dao = database.movieDao()
    }

    @After
    fun tearDown() {
        database.close()
    }

    @Test
    fun saveMovieList() = runBlocking {
        val movies = listOf(
            Movie(1, "overview1", "posterpath1", "releasedate1", "title1"),
            Movie(2, "overview2", "posterpath2", "releasedate2", "title2"),
            Movie(3, "overview3", "posterpath3", "releasedate3", "title3"),
            Movie(4, "overview4", "posterpath4", "releasedate4", "title4")
        )

        dao.saveMovies(movies)
        val allMovies = dao.getAllMovies()

        Truth.assertThat(allMovies).isEqualTo(movies)
    }

    @Test
    fun deleteMovies() = runBlocking {
        val movies = listOf(
            Movie(1, "overview1", "posterpath1", "releasedate1", "title1"),
            Movie(2, "overview2", "posterpath2", "releasedate2", "title2"),
            Movie(3, "overview3", "posterpath3", "releasedate3", "title3"),
            Movie(4, "overview4", "posterpath4", "releasedate4", "title4")
        )

        dao.saveMovies(movies)
        val movieResult = dao.deleteAllMovies()

        Truth.assertThat(movieResult).isEqualTo(Unit)
    }



}

