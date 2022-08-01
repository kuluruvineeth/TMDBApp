package com.kuluruvineeth.tmdbapp.data.model.artist


import com.google.gson.annotations.SerializedName
import com.kuluruvineeth.tmdbapp.data.model.artist.Artist

data class ArtistList(
    @SerializedName("results")
    val results: List<Artist>
)