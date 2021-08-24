package com.canonal.weatherapp.model

import android.graphics.drawable.Drawable
import android.widget.ImageView

data class City(
     val name: String,
     val weather: Weather,
     val image: String,
     val imageMini: String,
){

}