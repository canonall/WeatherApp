package com.canonal.weatherapp.data

import android.content.Context
import android.content.res.Resources
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.canonal.weatherapp.R
import com.canonal.weatherapp.model.City
import com.canonal.weatherapp.model.Weather
class Data {
    companion object {
        fun getWeatherData(context: Context): List<City> {

            val cities: MutableList<City> = mutableListOf()

            val iconSunny = ContextCompat.getDrawable(context,R.drawable.ic_sunny)
            val iconCloudy = ContextCompat.getDrawable(context,R.drawable.ic_cloudy)
            val iconRainy = ContextCompat.getDrawable(context,R.drawable.ic_rainy)

            val weatherIstanbul = Weather("sunny", "30°", iconSunny)
            val weatherBerlin = Weather("rainy", "21°", iconRainy)
            val weatherLondon = Weather("cloudy", "18°", iconCloudy)

            val imageMiniIstanbul = ContextCompat.getDrawable(context, R.drawable.sunny_mini)
            val imageMiniBerlin = ContextCompat.getDrawable(context, R.drawable.night_mini)
            val imageMiniLondon = ContextCompat.getDrawable(context, R.drawable.cloudy_mini)


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