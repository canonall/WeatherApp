package com.canonal.weatherapp.model

import android.graphics.drawable.Drawable
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Weather(
     val weatherDescription: String,
     val temperature: String,
     val icon: String
): Parcelable