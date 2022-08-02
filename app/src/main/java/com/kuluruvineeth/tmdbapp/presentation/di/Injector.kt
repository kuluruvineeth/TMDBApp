package com.kuluruvineeth.tmdbapp.presentation.di

import com.kuluruvineeth.tmdbapp.presentation.di.artist.ArtistSubComponent
import com.kuluruvineeth.tmdbapp.presentation.di.movie.MovieSubComponent
import com.kuluruvineeth.tmdbapp.presentation.di.tvshow.TvShowSubComponent

interface Injector {
    fun createMovieSubComponent():MovieSubComponent
    fun createTvShowSubComponent():TvShowSubComponent
    fun createArtistSubComponent():ArtistSubComponent
}