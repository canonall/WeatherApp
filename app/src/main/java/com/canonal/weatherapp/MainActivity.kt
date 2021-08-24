package com.canonal.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.canonal.weatherapp.adapter.WeatherListAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initWeatherRv()
    }

    private fun initWeatherRv() {
        val rvCity = findViewById<RecyclerView>(R.id.rv_city)
        val weatherListAdapter= WeatherListAdapter(applicationContext)

        rvCity.apply {
            layoutManager=LinearLayoutManager(this@MainActivity)
            adapter=weatherListAdapter

        }
    }
}