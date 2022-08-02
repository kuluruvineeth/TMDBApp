package com.kuluruvineeth.tmdbapp.presentation.di.core

import com.kuluruvineeth.tmdbapp.presentation.di.artist.ArtistSubComponent
import com.kuluruvineeth.tmdbapp.presentation.di.movie.MovieSubComponent
import com.kuluruvineeth.tmdbapp.presentation.di.tvshow.TvShowSubComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules=[
    AppModule::class,
    NetModule::class,
    DataBaseModule::class,
    UseCaseModule::class,
    RepositoryModule::class,
    RemoteDataModule::class,
    LocalDataModule::class,
    CacheDataModule::class
])
interface AppComponent {

    fun movieSubComponent():MovieSubComponent.Factory
    fun tvShowSubComponent():TvShowSubComponent.Factory
    fun artistSubComponent():ArtistSubComponent.Factory
}