package com.canonal.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.canonal.weatherapp.adapter.WeatherListAdapter
import com.canonal.weatherapp.data.Data
import com.canonal.weatherapp.model.City


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cities = Data.getWeatherData(applicationContext)
        initWeatherRv(cities)
    }

    private fun initWeatherRv(cities: ArrayList<City>) {
        val rvCity = findViewById<RecyclerView>(R.id.rv_city)
        val weatherListAdapter = WeatherListAdapter(applicationContext,cities) { position ->
            onCityItemClicked(
                cities,
                position
            )
        }

        rvCity.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = weatherListAdapter

        }
    }

    private fun onCityItemClicked(cities: ArrayList<City>, position: Int) {
        val intent = Intent(this, CityDetailsActivity::class.java)
        intent.putExtra("cities",cities)
        intent.putExtra("position",position)
        startActivity(intent)
    }

}