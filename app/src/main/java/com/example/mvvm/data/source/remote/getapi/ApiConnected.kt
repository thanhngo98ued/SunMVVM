package com.example.mvvm.data.source.remote.getapi

import com.example.mvvm.data.model.ModelItem
import com.example.mvvm.utils.Constant
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiConnected {
    @GET(Constant.UPCOMING_URL)
    fun getMovieFromUrl(
            @Query("page") page: Int,
            @Query("language") language: String,
            @Query("api_key") apiKey: String,
    ): Call<ModelItem>
}
