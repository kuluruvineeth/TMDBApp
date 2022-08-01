package com.kuluruvineeth.tmdbapp.data.repository.movie.datasource

import com.kuluruvineeth.tmdbapp.data.model.movie.Movie

interface MovieCacheDataSource {
    suspend fun getMoviesFromCache():List<Movie>
    suspend fun saveMoviesToCache(movies:List<Movie>)
}