package com.kuluruvineeth.tmdbapp.presentation.artist


import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.kuluruvineeth.tmdbapp.data.model.artist.Artist
import com.kuluruvineeth.tmdbapp.domain.usecase.GetArtistsUseCase
import com.kuluruvineeth.tmdbapp.domain.usecase.UpdateArtistsUseCase

class ArtistViewModel(
    private val getArtistsUseCase: GetArtistsUseCase,
    private val updateArtistsUseCase: UpdateArtistsUseCase
) : ViewModel(){

    fun getArtists() = liveData<List<Artist>?> {
        val artistsList = getArtistsUseCase.execute()
        emit(artistsList)
    }

    fun updateArtists() = liveData<List<Artist>?> {
        val artistsList = updateArtistsUseCase.execute()
        emit(artistsList)
    }
}