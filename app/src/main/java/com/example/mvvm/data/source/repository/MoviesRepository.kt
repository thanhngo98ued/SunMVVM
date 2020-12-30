package com.example.mvvm.data.source.repository

import com.example.mvvm.data.model.ModelItem
import com.example.mvvm.data.source.MovieDataSource
import com.example.mvvm.data.source.remote.MovieRemoteDataSourceImpl
import retrofit2.Call

class MoviesRepository private constructor(
    private val remote: MovieDataSource.Remote
) {

    fun getMovieFromUrl(): Call<ModelItem> {
        return remote.getMovieItemUpcoming()
    }

    companion object {
        fun newInstance() = MoviesRepository(MovieRemoteDataSourceImpl.newInstance())
    }
}
