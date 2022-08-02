package com.kuluruvineeth.tmdbapp.presentation.tvshows

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.kuluruvineeth.tmdbapp.data.model.tvshow.TvShow
import com.kuluruvineeth.tmdbapp.domain.usecase.GetTvshowsUseCase
import com.kuluruvineeth.tmdbapp.domain.usecase.UpdateTvShowsUseCase

class TvShowViewModel(
    private val getTvShowsUseCase : GetTvshowsUseCase,
    private val updateTvShowsUseCase: UpdateTvShowsUseCase
) : ViewModel(){

    fun getTvShows() = liveData<List<TvShow>?> {
        val tvShowList = getTvShowsUseCase.execute()
        emit(tvShowList)
    }

    fun updateTvShows() = liveData<List<TvShow>?> {
        val tvShowList = updateTvShowsUseCase.execute()
        emit(tvShowList)
    }
}