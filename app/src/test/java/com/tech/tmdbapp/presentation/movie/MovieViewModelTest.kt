package com.tech.tmdbapp.presentation.movie

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.common.truth.Truth.assertThat
import com.tech.tmdbapp.data.model.movie.Movie
import com.tech.tmdbapp.data.repository.movie.FakeMovieRepository
import com.tech.tmdbapp.domain.usecase.GetMoviesUseCase
import com.tech.tmdbapp.domain.usecase.UpdateMoviesUseCase
import com.tech.tmdbapp.getOrAwaitValue
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MovieViewModelTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var movieViewModel: MovieViewModel


    @Before
    fun setUp() {
        val fakeMovieRepository = FakeMovieRepository()
        val getMovieUseCase = GetMoviesUseCase(fakeMovieRepository)
        val updateMovieUseCase = UpdateMoviesUseCase(fakeMovieRepository)
        movieViewModel = MovieViewModel(getMovieUseCase, updateMovieUseCase)

    }


    @After
    fun tearDown() {

    }


    @Test
    fun getMovies_returnsCurrentList() {
        val movies = mutableListOf<Movie>()
        movies.add(Movie(1, "overview1", "pP", "rD1", "title1"))
        movies.add(Movie(2, "overview2", "pP", "rD2", "title2"))

        val currentMovieList = movieViewModel.getMovieList().getOrAwaitValue()
        assertThat(currentMovieList).isEqualTo(movies)
    }

    @Test
    fun updateMovies_returnsUpdatedList() {
        val movies = mutableListOf<Movie>()
        movies.add(Movie(3, "overview3", "pP", "rD3", "title3"))
        movies.add(Movie(4, "overview4", "pP", "rD4", "title4"))

        val updatedMovieList = movieViewModel.updateMovieList().getOrAwaitValue()
        assertThat(updatedMovieList).isEqualTo(movies)
    }

}