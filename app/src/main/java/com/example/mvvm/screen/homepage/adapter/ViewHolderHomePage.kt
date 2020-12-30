package com.example.mvvm.screen.homepage.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvm.data.model.MovieItem
import com.example.mvvm.utils.Constant
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_movie_grid_layout.view.*

class ViewHolderHomePage(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bindData(movie: MovieItem) {
        itemView.apply {
            textViewRateMovieGrid.text = movie.vote.toString()
            textViewTitleMovieGrid.text = movie.name
            Picasso.get().load(Constant.BASE_IMAGE + movie.photo).into(imageViewMovieGrid)
        }
    }
}
