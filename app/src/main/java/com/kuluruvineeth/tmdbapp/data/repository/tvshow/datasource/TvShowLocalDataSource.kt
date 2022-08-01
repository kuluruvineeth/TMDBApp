package com.kuluruvineeth.tmdbapp.data.repository.tvshow.datasource

import com.kuluruvineeth.tmdbapp.data.model.tvshow.TvShow

interface TvShowLocalDataSource {

    suspend fun getTvShowsFromDB():List<TvShow>
    suspend fun saveTvShowsToDB(tvShows:List<TvShow>)
    suspend fun clearAll()
}