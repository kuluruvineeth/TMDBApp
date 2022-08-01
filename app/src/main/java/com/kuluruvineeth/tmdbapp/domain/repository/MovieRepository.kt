package com.kuluruvineeth.tmdbapp.domain.repository

import com.kuluruvineeth.tmdbapp.data.model.movie.Movie

interface MovieRepository {

    suspend fun getMovies():List<Movie>?
    suspend fun updateMovies():List<Movie>?
}