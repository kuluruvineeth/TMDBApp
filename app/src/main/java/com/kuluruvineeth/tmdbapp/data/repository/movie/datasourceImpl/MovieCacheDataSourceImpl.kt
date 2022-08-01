package com.kuluruvineeth.tmdbapp.data.repository.movie.datasourceImpl

import com.kuluruvineeth.tmdbapp.data.model.movie.Movie
import com.kuluruvineeth.tmdbapp.data.repository.movie.datasource.MovieCacheDataSource

class MovieCacheDataSourceImpl : MovieCacheDataSource {
    private var movieList = ArrayList<Movie>()
    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
        movieList.clear()
        movieList = ArrayList(movies)
    }
}