package com.kuluruvineeth.tmdbapp.data.repository.movie.datasourceImpl

import com.kuluruvineeth.tmdbapp.data.api.TMDBService
import com.kuluruvineeth.tmdbapp.data.model.movie.MovieList
import com.kuluruvineeth.tmdbapp.data.repository.movie.datasource.MovieRemoteDatasource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService : TMDBService,
    private val apiKey:String
) : MovieRemoteDatasource {
    override suspend fun getMovies(): Response<MovieList> {
        return tmdbService.getPopularMovies(apiKey)
    }
}