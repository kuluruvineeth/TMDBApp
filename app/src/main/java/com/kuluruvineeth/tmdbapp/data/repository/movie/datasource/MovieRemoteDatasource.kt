package com.kuluruvineeth.tmdbapp.data.repository.movie.datasource

import com.kuluruvineeth.tmdbapp.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDatasource {

    suspend fun getMovies():Response<MovieList>
}