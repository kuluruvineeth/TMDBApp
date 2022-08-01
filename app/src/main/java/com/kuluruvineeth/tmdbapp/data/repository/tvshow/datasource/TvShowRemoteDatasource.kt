package com.kuluruvineeth.tmdbapp.data.repository.tvshow.datasource

import com.kuluruvineeth.tmdbapp.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDatasource {

    suspend fun getTvShows():Response<TvShowList>
}