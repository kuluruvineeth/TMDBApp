package com.kuluruvineeth.tmdbapp.presentation.di.core

import com.kuluruvineeth.tmdbapp.domain.repository.ArtistRepository
import com.kuluruvineeth.tmdbapp.domain.repository.MovieRepository
import com.kuluruvineeth.tmdbapp.domain.repository.TvRepository
import com.kuluruvineeth.tmdbapp.domain.usecase.*
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UseCaseModule {

    @Provides
    fun provideGetMovieUseCase(movieRepository: MovieRepository):GetMoviesUseCase{
        return GetMoviesUseCase(movieRepository)
    }

    @Provides
    fun provideUpdateMovieUseCase(movieRepository: MovieRepository):UpdateMoviesUsecase{
        return UpdateMoviesUsecase(movieRepository)
    }

    @Provides
    fun provideGetTvShowUseCase(tvRepository: TvRepository):GetTvshowsUseCase{
        return GetTvshowsUseCase(tvRepository)
    }

    @Provides
    fun provideUpdateTvShowUseCase(tvRepository: TvRepository):UpdateTvShowsUseCase{
        return UpdateTvShowsUseCase(tvRepository)
    }

    @Provides
    fun provideGetArtistUseCase(artistRepository: ArtistRepository):GetArtistsUseCase{
        return GetArtistsUseCase(artistRepository)
    }

    @Provides
    fun provideUpdateArtistUseCase(artistRepository: ArtistRepository):UpdateArtistsUseCase{
        return UpdateArtistsUseCase(artistRepository)
    }


}