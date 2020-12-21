package com.example.mvvm.screen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mvvm.R
import com.example.mvvm.screen.homepage.adapter.HomePageFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFragmentHomePage()
    }

    private fun initFragmentHomePage() {
        supportFragmentManager.beginTransaction()
            .add(R.id.frameHomeMain, HomePageFragment.newInstance()).commit()
    }
}
