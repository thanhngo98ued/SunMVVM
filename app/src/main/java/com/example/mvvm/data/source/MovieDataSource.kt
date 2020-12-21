package com.example.mvvm.data.source

import com.example.mvvm.data.model.ModelItem
import retrofit2.Call

interface MovieDataSource {
    interface Remote {
        fun getMovieItemUpcoming(): Call<ModelItem>
    }
}
