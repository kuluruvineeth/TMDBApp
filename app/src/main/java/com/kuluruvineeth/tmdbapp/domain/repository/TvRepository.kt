package com.kuluruvineeth.tmdbapp.domain.repository

import com.kuluruvineeth.tmdbapp.data.model.tvshow.TvShow

interface TvRepository {

    suspend fun getTvShows():List<TvShow>?
    suspend fun updateTvShows():List<TvShow>?
}