package com.kuluruvineeth.tmdbapp.domain.usecase

import com.kuluruvineeth.tmdbapp.data.model.tvshow.TvShow
import com.kuluruvineeth.tmdbapp.domain.repository.TvRepository

class GetTvshowsUseCase(
    private val tvRepository: TvRepository
) {

    suspend fun execute():List<TvShow>? = tvRepository.getTvShows()
}