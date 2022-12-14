package com.kuluruvineeth.tmdbapp.data.repository.movie

import android.util.Log
import com.kuluruvineeth.tmdbapp.data.model.movie.Movie
import com.kuluruvineeth.tmdbapp.data.repository.movie.datasource.MovieCacheDataSource
import com.kuluruvineeth.tmdbapp.data.repository.movie.datasource.MovieLocalDataSource
import com.kuluruvineeth.tmdbapp.data.repository.movie.datasource.MovieRemoteDatasource
import com.kuluruvineeth.tmdbapp.domain.repository.MovieRepository

class MovieRepositoryImpl(
    private val movieRemoteDatasource : MovieRemoteDatasource,
    private val movieLocalDataSource: MovieLocalDataSource,
    private val movieCacheDataSource: MovieCacheDataSource
) : MovieRepository {
    override suspend fun getMovies(): List<Movie>? {
        return getMoviesFromCache()
    }

    override suspend fun updateMovies(): List<Movie>? {
        val newListOfMovies = getMoviesFromAPI()
        movieLocalDataSource.clearAll()
        movieLocalDataSource.saveMoviesToDB(newListOfMovies)
        movieCacheDataSource.saveMoviesToCache(newListOfMovies)
        return newListOfMovies
    }

    suspend fun getMoviesFromAPI():List<Movie>{
        lateinit var movieList:List<Movie>
        try {
            val response = movieRemoteDatasource.getMovies()
            val body = response.body()
            Log.i("MYTAG",response.toString())
            Log.i("MYTAG",body.toString())
            if(body!=null){
                movieList = body.movies
            }
        }catch (exception:Exception){
            Log.i("MyTag",exception.message.toString())
        }
        return movieList
    }

    suspend fun getMoviesFromDB():List<Movie>{
        lateinit var movieList:List<Movie>
        try {
            movieList = movieLocalDataSource.getMoviesFromDB()
        }catch (exception:Exception){
            Log.i("MyTag",exception.message.toString())
        }
        if(movieList.size>0){
            return movieList
        }else{
            movieList = getMoviesFromAPI()
            movieLocalDataSource.saveMoviesToDB(movieList)
        }
        return movieList
    }

    suspend fun getMoviesFromCache():List<Movie>{
        lateinit var movieList:List<Movie>
        try {
            movieList = movieCacheDataSource.getMoviesFromCache()
        }catch (exception:Exception){
            Log.i("MyTag",exception.message.toString())
        }
        if(movieList.size>0){
            return movieList
        }else{
            movieList = getMoviesFromDB()
            movieCacheDataSource.saveMoviesToCache(movieList)
        }
        return movieList
    }
}