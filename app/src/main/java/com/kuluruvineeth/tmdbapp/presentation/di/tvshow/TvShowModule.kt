package com.kuluruvineeth.tmdbapp.presentation.di.tvshow

import com.kuluruvineeth.tmdbapp.domain.usecase.GetTvshowsUseCase
import com.kuluruvineeth.tmdbapp.domain.usecase.UpdateTvShowsUseCase
import com.kuluruvineeth.tmdbapp.presentation.tvshows.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {
    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvshowsUseCase: GetTvshowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ):TvShowViewModelFactory{
        return TvShowViewModelFactory(getTvshowsUseCase,updateTvShowsUseCase)
    }
}