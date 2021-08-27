package com.canonal.weatherapp.data

import android.content.Context
import com.canonal.weatherapp.R
import com.canonal.weatherapp.model.City
import com.canonal.weatherapp.model.Weather


object Data {
        fun getWeatherData(context: Context): ArrayList<City> {

            val cities: ArrayList<City> = arrayListOf()

            val iconSunny = context.resources.getResourceEntryName(R.drawable.ic_sunny)
            val iconCloudy = context.resources.getResourceEntryName(R.drawable.ic_snowy)
            val iconRainy = context.resources.getResourceEntryName(R.drawable.ic_rainy)

            val weatherIstanbul = Weather("Sunny", "25°", iconSunny)
            val weatherBerlin = Weather("Rainy", "21°", iconRainy)
            val weatherLondon = Weather("Snowy", "18°", iconCloudy)

            val imageMiniIstanbul = context.resources.getResourceEntryName(R.drawable.mini_sunny)
            val imageMiniBerlin = context.resources.getResourceEntryName(R.drawable.mini_rainy)
            val imageMiniLondon = context.resources.getResourceEntryName(R.drawable.mini_snowy)

            val imageIstanbul = context.resources.getResourceEntryName(R.drawable.background_sunny)
            val imageBerlin = context.resources.getResourceEntryName(R.drawable.background_rainy)
            val imageLondon = context.resources.getResourceEntryName(R.drawable.background_snowy)

            val cityIstanbul = City("Paris", weatherIstanbul, imageIstanbul, imageMiniIstanbul)
            val cityBerlin = City("San Francisco", weatherBerlin, imageBerlin, imageMiniBerlin)
            val cityLondon = City("New York", weatherLondon, imageLondon, imageMiniLondon)

            cities.add(cityIstanbul)
            cities.add(cityBerlin)
            cities.add(cityLondon)

            return cities
        }
    }


