package com.kuluruvineeth.tmdbapp.data.repository.tvshow.datasourceImpl

import com.kuluruvineeth.tmdbapp.data.api.TMDBService
import com.kuluruvineeth.tmdbapp.data.model.tvshow.TvShowList
import com.kuluruvineeth.tmdbapp.data.repository.tvshow.datasource.TvShowRemoteDatasource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService : TMDBService,
    private val apiKey:String
) : TvShowRemoteDatasource {
    override suspend fun getTvShows(): Response<TvShowList> {
        return tmdbService.getPopularTvShows(apiKey)
    }
}