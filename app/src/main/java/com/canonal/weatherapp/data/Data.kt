package com.canonal.weatherapp.data

import android.content.Context
import android.content.res.Resources
import com.canonal.weatherapp.R
import com.canonal.weatherapp.model.City
import com.canonal.weatherapp.model.Weather

class Data {
    companion object {
        fun getWeatherData(context: Context): List<City> {

            val cities: MutableList<City> = mutableListOf()

            val weatherIstanbul = Weather("Sunny", "30", "iconUrl")
            val weatherBerlin = Weather("Rainy", "21", "iconUrl")
            val weatherLondon = Weather("cloudy", "18", "iconUrl")


            val imageMiniIstanbul: String =
                context.resources.getResourceEntryName(R.drawable.cloudy_mini)
            val imageMiniBerlin: String =
                context.resources.getResourceEntryName(R.drawable.night_mini)
            val imageMiniLondon: String =
                context.resources.getResourceEntryName(R.drawable.sunny_mini)


            val cityIstanbul = City("Istanbul", weatherIstanbul, "imageUrl", imageMiniIstanbul)
            val cityBerlin = City("Berlin", weatherBerlin, "imageUrl", imageMiniBerlin)
            val cityLondon = City("London", weatherLondon, "imageUrl", imageMiniLondon)

            cities.add(cityIstanbul)
            cities.add(cityBerlin)
            cities.add(cityLondon)

            return cities
        }
    }


}