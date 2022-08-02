package com.kuluruvineeth.tmdbapp.presentation.di.movie


import com.kuluruvineeth.tmdbapp.domain.usecase.GetMoviesUseCase
import com.kuluruvineeth.tmdbapp.domain.usecase.UpdateMoviesUsecase
import com.kuluruvineeth.tmdbapp.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUsecase: UpdateMoviesUsecase
    ):MovieViewModelFactory{
        return MovieViewModelFactory(getMoviesUseCase,updateMoviesUsecase)
    }
}