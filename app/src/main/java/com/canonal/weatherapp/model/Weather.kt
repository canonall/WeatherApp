package com.canonal.weatherapp.model

import android.graphics.drawable.Drawable

data class Weather(
     val weatherDescription: String,
     val temperature: String,
     val icon: Drawable?
)