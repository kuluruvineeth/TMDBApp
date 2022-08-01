package com.kuluruvineeth.tmdbapp.data.api

import com.kuluruvineeth.tmdbapp.data.ArtistList
import com.kuluruvineeth.tmdbapp.data.MovieList
import com.kuluruvineeth.tmdbapp.data.TvShowList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBService {
    @GET("/movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key") apiKey:String): Response<MovieList>

    @GET("/tv/popular")
    suspend fun getPopularTvShows(
        @Query("api_key") apiKey:String): Response<TvShowList>

    @GET("/person/popular")
    suspend fun getPopularArtist(
        @Query("api_key") apiKey:String): Response<ArtistList>
}