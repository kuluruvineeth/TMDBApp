package com.kuluruvineeth.tmdbapp.presentation.di.core

import com.kuluruvineeth.tmdbapp.data.api.TMDBService
import com.kuluruvineeth.tmdbapp.data.repository.artist.datasource.ArtistRemoteDatasource
import com.kuluruvineeth.tmdbapp.data.repository.artist.datasourceImpl.ArtistRemoteDataSourceImpl
import com.kuluruvineeth.tmdbapp.data.repository.movie.datasource.MovieRemoteDatasource
import com.kuluruvineeth.tmdbapp.data.repository.movie.datasourceImpl.MovieRemoteDataSourceImpl
import com.kuluruvineeth.tmdbapp.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.kuluruvineeth.tmdbapp.data.repository.tvshow.datasourceImpl.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(
    private val apiKey : String
) {

    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService):MovieRemoteDatasource{
        return MovieRemoteDataSourceImpl(
            tmdbService,
            apiKey
        )
    }

    @Singleton
    @Provides
    fun provideTvShowRemoteDataSource(tmdbService: TMDBService):TvShowRemoteDatasource{
        return TvShowRemoteDataSourceImpl(
            tmdbService,
            apiKey
        )
    }

    @Singleton
    @Provides
    fun provideArtistRemoteDataSource(tmdbService: TMDBService):ArtistRemoteDatasource{
        return ArtistRemoteDataSourceImpl(
            tmdbService,
            apiKey
        )
    }
}