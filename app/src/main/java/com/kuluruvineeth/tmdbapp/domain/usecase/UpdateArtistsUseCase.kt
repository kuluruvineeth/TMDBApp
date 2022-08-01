package com.kuluruvineeth.tmdbapp.domain.usecase

import com.kuluruvineeth.tmdbapp.data.model.artist.Artist
import com.kuluruvineeth.tmdbapp.domain.repository.ArtistRepository

class UpdateArtistsUseCase(
    private val artistRepository: ArtistRepository
) {
    suspend fun execute():List<Artist>? = artistRepository.updateArtists()
}