package com.example.mvvm.data.source.remote

import com.example.mvvm.BuildConfig
import com.example.mvvm.data.model.ModelItem
import com.example.mvvm.data.source.MovieDataSource
import com.example.mvvm.data.source.remote.getapi.ApiConnected
import com.example.mvvm.data.source.remote.getapi.RetrofitClient
import com.example.mvvm.utils.Constant
import com.example.mvvm.utils.TypeUrl
import retrofit2.Call

class MovieRemoteDataSourceImpl : MovieDataSource.Remote {
    override fun getMovieItemUpcoming(): Call<ModelItem> {
        return RetrofitClient.createService(ApiConnected::class.java)
            .getMovieFromUrl(Constant.PAGE, Constant.LANGUAGE, BuildConfig.API_KEY)
    }

    companion object {
        fun newInstance() = MovieRemoteDataSourceImpl()
    }
}
