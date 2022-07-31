package com.kuluruvineeth.tmdbapp.data


import com.google.gson.annotations.SerializedName
import com.kuluruvineeth.tmdbapp.data.Movie

data class MovieList(
    @SerializedName("results")
    val results: List<Movie>,
)