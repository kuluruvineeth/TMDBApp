package com.kuluruvineeth.tmdbapp.data.repository.artist.datasourceImpl

import com.kuluruvineeth.tmdbapp.data.api.TMDBService
import com.kuluruvineeth.tmdbapp.data.model.artist.ArtistList
import com.kuluruvineeth.tmdbapp.data.repository.artist.datasource.ArtistRemoteDatasource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService : TMDBService,
    private val apiKey:String
) : ArtistRemoteDatasource {
    override suspend fun getArtists(): Response<ArtistList> {
        return tmdbService.getPopularArtist(apiKey)
    }
}