package com.example.mvvm.screen.homepage.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm.R
import com.example.mvvm.screen.homepage.viewmodel.HomePageViewModel
import kotlinx.android.synthetic.main.fragment_home_page.*

class HomePageFragment : Fragment() {

    private lateinit var homePageViewModel: HomePageViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        homePageViewModel = ViewModelProvider(this).get(HomePageViewModel::class.java)
        buttonLoadMovie.setOnClickListener {
            homePageViewModel.apply {
                showMovieItem()
                _listModelItem.observe(viewLifecycleOwner, {
                    recyclerViewHomePage.adapter = HomePageAdapter(it)
                })
            }
        }
    }

    companion object {
        fun newInstance() = HomePageFragment()
    }
}
