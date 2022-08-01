package com.kuluruvineeth.tmdbapp.data.repository.movie.datasource

import com.kuluruvineeth.tmdbapp.data.model.movie.Movie

interface MovieLocalDataSource {

    suspend fun getMoviesFromDB():List<Movie>
    suspend fun saveMoviesToDB(movies:List<Movie>)
    suspend fun clearAll()
}