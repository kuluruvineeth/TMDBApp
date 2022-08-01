package com.kuluruvineeth.tmdbapp.data.repository.artist.datasource

import com.kuluruvineeth.tmdbapp.data.model.artist.Artist

interface ArtistLocalDataSource {

    suspend fun getArtistsFromDB():List<Artist>
    suspend fun saveArtistsToDB(artists:List<Artist>)
    suspend fun clearAll()
}