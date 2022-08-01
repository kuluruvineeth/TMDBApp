package com.kuluruvineeth.tmdbapp.data.repository.tvshow.datasource

import com.kuluruvineeth.tmdbapp.data.model.tvshow.TvShow

interface TvShowCacheDataSource {
    suspend fun getTvShowsFromCache():List<TvShow>
    suspend fun saveTvShowsToCache(tvShows:List<TvShow>)
}