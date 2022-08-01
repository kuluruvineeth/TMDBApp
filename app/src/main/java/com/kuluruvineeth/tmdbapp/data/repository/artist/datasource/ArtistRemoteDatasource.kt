package com.kuluruvineeth.tmdbapp.data.repository.artist.datasource

import com.kuluruvineeth.tmdbapp.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDatasource {

    suspend fun getArtists():Response<ArtistList>
}