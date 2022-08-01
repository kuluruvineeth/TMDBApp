package com.kuluruvineeth.tmdbapp.data.model.movie


import com.google.gson.annotations.SerializedName
import com.kuluruvineeth.tmdbapp.data.model.movie.Movie

data class MovieList(
    @SerializedName("results")
    val results: List<Movie>,
)