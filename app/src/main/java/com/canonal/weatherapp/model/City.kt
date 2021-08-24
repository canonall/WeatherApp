package com.canonal.weatherapp.model

import android.graphics.drawable.Drawable
import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class City(
     val name: String,
     val weather: Weather,
     val image: String,
     val imageMini: String,
): Parcelable