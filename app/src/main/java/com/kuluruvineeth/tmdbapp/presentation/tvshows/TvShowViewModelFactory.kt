package com.kuluruvineeth.tmdbapp.presentation.tvshows

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.kuluruvineeth.tmdbapp.domain.usecase.GetTvshowsUseCase
import com.kuluruvineeth.tmdbapp.domain.usecase.UpdateTvShowsUseCase

class TvShowViewModelFactory(
    private val getTvshowsUseCase: GetTvshowsUseCase,
    private val updateTvShowsUseCase: UpdateTvShowsUseCase
) : ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TvShowViewModel(getTvshowsUseCase,updateTvShowsUseCase) as T
    }
}