package com.kuluruvineeth.tmdbapp.presentation.movie

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.common.truth.Truth
import com.kuluruvineeth.tmdbapp.data.model.movie.Movie
import com.kuluruvineeth.tmdbapp.data.repository.movie.FakeMovieRepository
import com.kuluruvineeth.tmdbapp.domain.usecase.GetMoviesUseCase
import com.kuluruvineeth.tmdbapp.domain.usecase.UpdateMoviesUsecase
import com.kuluruvineeth.tmdbapp.getOrAwaitValue
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MovieViewModelTest{

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var viewModel: MovieViewModel

    @Before
    fun setUp() {
        val fakeMovieRepository = FakeMovieRepository()
        val getMoviesUsecase = GetMoviesUseCase(fakeMovieRepository)
        val updateMoviesUsecase = UpdateMoviesUsecase(fakeMovieRepository)
        viewModel = MovieViewModel(getMoviesUsecase,updateMoviesUsecase)
    }

    @Test
    fun getMovies_returnsCurrentsList(){
        val movies = mutableListOf<Movie>()
        movies.add(Movie(1,"overview1","posterpath1","date1","title1"))
        movies.add(Movie(2,"overview2","posterpath2","date2","title2"))

        val currentList = viewModel.getMovies().getOrAwaitValue()

        Truth.assertThat(currentList).isEqualTo(movies)
    }

    @Test
    fun updateMovies_returnsUpdatedList(){
        val movies = mutableListOf<Movie>()
        movies.add(Movie(3,"overview3","posterpath3","date3","title3"))
        movies.add(Movie(4,"overview4","posterpath4","date4","title4"))

        val updatedList = viewModel.updateMovies().getOrAwaitValue()

        Truth.assertThat(updatedList).isEqualTo(movies)
    }
}