package com.kuluruvineeth.tmdbapp.presentation.di.tvshow

import com.kuluruvineeth.tmdbapp.presentation.tvshows.TvShowActivity
import dagger.Subcomponent

@TvShowScope
@Subcomponent(modules = [TvShowModule::class])
interface TvShowSubComponent {
    fun inject(tvshowActivity: TvShowActivity)
    @Subcomponent.Factory
    interface Factory{
        fun create():TvShowSubComponent
    }
}