package com.kuluruvineeth.tmdbapp.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.kuluruvineeth.tmdbapp.data.model.movie.Movie
import com.kuluruvineeth.tmdbapp.domain.usecase.GetMoviesUseCase
import com.kuluruvineeth.tmdbapp.domain.usecase.UpdateMoviesUsecase

class MovieViewModel(
    private val getMoviesUseCase : GetMoviesUseCase,
    private val updateMoviesUsecase: UpdateMoviesUsecase
):ViewModel() {

    fun getMovies() = liveData<List<Movie>?> {
        val movieList = getMoviesUseCase.execute()
        emit(movieList)
    }

    fun updateMovies() = liveData<List<Movie>?> {
        val movieList = updateMoviesUsecase.execute()
        emit(movieList)
    }
}