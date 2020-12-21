package com.example.mvvm.screen.homepage.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm.data.model.ModelItem
import com.example.mvvm.data.model.MovieItem
import com.example.mvvm.data.source.repository.MoviesRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomePageViewModel() : ViewModel() {

    private val repository = MoviesRepository.newInstance()
    val _listModelItem = MutableLiveData<List<MovieItem>>()
    private val _errorLiveData = MutableLiveData<List<MovieItem>>()

    fun showMovieItem() {
        repository.getMovieFromUrl().enqueue(object : Callback<ModelItem> {
            override fun onResponse(call: Call<ModelItem>, response: Response<ModelItem>) {
                _listModelItem.value = response.body()!!.resultsApi
            }

            override fun onFailure(call: Call<ModelItem>, t: Throwable) {
                t.message?.let { Log.e("Error", it) }
            }
        })
    }
}
