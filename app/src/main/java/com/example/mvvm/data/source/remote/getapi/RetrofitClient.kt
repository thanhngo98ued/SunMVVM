package com.example.mvvm.data.source.remote.getapi

import com.example.mvvm.utils.Constant
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private val retrofit = Retrofit.Builder()
            .baseUrl(Constant.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    fun <S> createService(interfaceService: Class<S>): S {
        return retrofit.create(interfaceService)
    }
}
