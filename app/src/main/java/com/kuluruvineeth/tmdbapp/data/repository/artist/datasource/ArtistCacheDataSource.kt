package com.kuluruvineeth.tmdbapp.data.repository.artist.datasource

import com.kuluruvineeth.tmdbapp.data.model.artist.Artist

interface ArtistCacheDataSource {
    suspend fun getArtistsFromCache():List<Artist>
    suspend fun saveArtistsToCache(artists:List<Artist>)
}