package com.kuluruvineeth.tmdbapp.presentation.di.artist

import com.kuluruvineeth.tmdbapp.domain.usecase.GetArtistsUseCase
import com.kuluruvineeth.tmdbapp.domain.usecase.UpdateArtistsUseCase
import com.kuluruvineeth.tmdbapp.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {
    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistsUseCase: UpdateArtistsUseCase
    ):ArtistViewModelFactory{
        return ArtistViewModelFactory(getArtistsUseCase,updateArtistsUseCase)
    }
}