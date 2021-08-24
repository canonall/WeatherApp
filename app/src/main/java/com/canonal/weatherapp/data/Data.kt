package com.canonal.weatherapp.data

import android.content.Context
import com.canonal.weatherapp.R
import com.canonal.weatherapp.model.City
import com.canonal.weatherapp.model.Weather


object Data {
        fun getWeatherData(context: Context): ArrayList<City> {

            val cities: ArrayList<City> = arrayListOf()

            val iconSunny = context.resources.getResourceEntryName(R.drawable.ic_sunny)
            val iconCloudy = context.resources.getResourceEntryName(R.drawable.ic_cloudy)
            val iconRainy = context.resources.getResourceEntryName(R.drawable.ic_rainy)

            val weatherIstanbul = Weather("Sunny", "30°", iconSunny)
            val weatherBerlin = Weather("Rainy", "21°", iconRainy)
            val weatherLondon = Weather("Cloudy", "18°", iconCloudy)

            val imageMiniIstanbul = context.resources.getResourceEntryName(R.drawable.sunny_mini)
            val imageMiniBerlin = context.resources.getResourceEntryName(R.drawable.night_mini)
            val imageMiniLondon = context.resources.getResourceEntryName(R.drawable.cloudy_mini)

            val imageIstanbul = context.resources.getResourceEntryName(R.drawable.sunny)
            val imageBerlin = context.resources.getResourceEntryName(R.drawable.night)
            val imageLondon = context.resources.getResourceEntryName(R.drawable.cloudy)


            val cityIstanbul = City("Istanbul", weatherIstanbul, imageIstanbul, imageMiniIstanbul)
            val cityBerlin = City("Berlin", weatherBerlin, imageBerlin, imageMiniBerlin)
            val cityLondon = City("London", weatherLondon, imageLondon, imageMiniLondon)

            cities.add(cityIstanbul)
            cities.add(cityBerlin)
            cities.add(cityLondon)

            return cities
        }
    }


