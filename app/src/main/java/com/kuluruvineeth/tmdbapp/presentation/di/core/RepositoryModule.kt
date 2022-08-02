package com.kuluruvineeth.tmdbapp.presentation.di.core

import com.kuluruvineeth.tmdbapp.data.repository.artist.ArtistRepositoryImpl
import com.kuluruvineeth.tmdbapp.data.repository.artist.datasource.ArtistCacheDataSource
import com.kuluruvineeth.tmdbapp.data.repository.artist.datasource.ArtistLocalDataSource
import com.kuluruvineeth.tmdbapp.data.repository.artist.datasource.ArtistRemoteDatasource
import com.kuluruvineeth.tmdbapp.data.repository.movie.MovieRepositoryImpl
import com.kuluruvineeth.tmdbapp.data.repository.movie.datasource.MovieCacheDataSource
import com.kuluruvineeth.tmdbapp.data.repository.movie.datasource.MovieLocalDataSource
import com.kuluruvineeth.tmdbapp.data.repository.movie.datasource.MovieRemoteDatasource
import com.kuluruvineeth.tmdbapp.data.repository.tvshow.TvShowRepositoryImpl
import com.kuluruvineeth.tmdbapp.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.kuluruvineeth.tmdbapp.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.kuluruvineeth.tmdbapp.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.kuluruvineeth.tmdbapp.domain.repository.ArtistRepository
import com.kuluruvineeth.tmdbapp.domain.repository.MovieRepository
import com.kuluruvineeth.tmdbapp.domain.repository.TvRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDatasource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ):MovieRepository{
        return MovieRepositoryImpl(
            movieRemoteDatasource,
            movieLocalDataSource,
            movieCacheDataSource
        )
    }

    @Singleton
    @Provides
    fun provideTvShowRepository(
        tvShowRemoteDatasource: TvShowRemoteDatasource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource
    ): TvRepository {
        return TvShowRepositoryImpl(
            tvShowRemoteDatasource,
            tvShowLocalDataSource,
            tvShowCacheDataSource
        )
    }

    @Singleton
    @Provides
    fun provideArtistRepository(
        artistRemoteDatasource: ArtistRemoteDatasource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistRepository{
        return ArtistRepositoryImpl(
            artistRemoteDatasource,
            artistLocalDataSource,
            artistCacheDataSource
        )
    }
}