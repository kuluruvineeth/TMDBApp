package com.kuluruvineeth.tmdbapp.domain.repository

import com.kuluruvineeth.tmdbapp.data.model.artist.Artist

interface ArtistRepository {

    suspend fun getArtists():List<Artist>?
    suspend fun updateArtists():List<Artist>?
}