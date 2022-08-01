package com.kuluruvineeth.tmdbapp.data.repository.artist.datasourceImpl

import com.kuluruvineeth.tmdbapp.data.model.artist.Artist
import com.kuluruvineeth.tmdbapp.data.repository.artist.datasource.ArtistCacheDataSource

class ArtistCacheDataSourceImpl : ArtistCacheDataSource {
    private var artistList = ArrayList<Artist>()
    override suspend fun getArtistsFromCache(): List<Artist> {
        return artistList
    }

    override suspend fun saveArtistsToCache(artists: List<Artist>) {
        artistList.clear()
        artistList = ArrayList(artists)
    }
}