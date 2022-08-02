package com.kuluruvineeth.tmdbapp.presentation.di.artist

import com.kuluruvineeth.tmdbapp.presentation.artist.ArtistActivity
import dagger.Subcomponent

@ArtistScope
@Subcomponent(modules = [ArtistModule::class])
interface ArtistSubComponent {
    fun inject(artistActivity: ArtistActivity)
    @Subcomponent.Factory
    interface Factory{
        fun create():ArtistSubComponent
    }
}