package com.example.mvvm.screen.homepage.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvm.R
import com.example.mvvm.data.model.MovieItem

class HomePageAdapter(private val listMovieItem: List<MovieItem>) :
    RecyclerView.Adapter<ViewHolderHomePage>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderHomePage {
        return ViewHolderHomePage(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_movie_grid_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolderHomePage, position: Int) {
        holder.bindData(listMovieItem[position])
    }

    override fun getItemCount(): Int = listMovieItem.size
}
