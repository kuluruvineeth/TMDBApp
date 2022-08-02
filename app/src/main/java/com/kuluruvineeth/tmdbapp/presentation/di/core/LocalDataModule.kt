package com.kuluruvineeth.tmdbapp.presentation.di.core

import com.kuluruvineeth.tmdbapp.data.db.ArtistDao
import com.kuluruvineeth.tmdbapp.data.db.MovieDao
import com.kuluruvineeth.tmdbapp.data.db.TvShowDao
import com.kuluruvineeth.tmdbapp.data.repository.artist.datasource.ArtistLocalDataSource
import com.kuluruvineeth.tmdbapp.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.kuluruvineeth.tmdbapp.data.repository.movie.datasource.MovieLocalDataSource
import com.kuluruvineeth.tmdbapp.data.repository.movie.datasourceImpl.MovieLocalDataSourceImpl
import com.kuluruvineeth.tmdbapp.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.kuluruvineeth.tmdbapp.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import com.kuluruvineeth.tmdbapp.data.repository.tvshow.datasourceImpl.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao):MovieLocalDataSource{
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao):TvShowLocalDataSource{
        return TvShowLocalDataSourceImpl(tvShowDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao: ArtistDao):ArtistLocalDataSource{
        return ArtistLocalDataSourceImpl(artistDao)
    }
}