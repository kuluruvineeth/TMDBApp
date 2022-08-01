package com.kuluruvineeth.tmdbapp.domain.usecase

import com.kuluruvineeth.tmdbapp.data.model.movie.Movie
import com.kuluruvineeth.tmdbapp.domain.repository.MovieRepository

class UpdateMoviesUsecase(
    private val movieRepository: MovieRepository
) {
    suspend fun execute():List<Movie>? = movieRepository.updateMovies()
}