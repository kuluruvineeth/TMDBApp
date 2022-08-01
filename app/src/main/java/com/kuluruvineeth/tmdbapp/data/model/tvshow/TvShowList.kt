package com.kuluruvineeth.tmdbapp.data.model.tvshow


import com.google.gson.annotations.SerializedName
import com.kuluruvineeth.tmdbapp.data.model.tvshow.TvShow

data class TvShowList(
    @SerializedName("results")
    val tvShows: List<TvShow>,
)