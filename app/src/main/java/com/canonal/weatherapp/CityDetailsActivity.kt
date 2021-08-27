package com.canonal.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import com.canonal.weatherapp.model.City
import java.util.ArrayList

class CityDetailsActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city_details)


        val tvDetailCityName = findViewById<TextView>(R.id.tv_detail_city_name)
        val tvDetailTemperature = findViewById<TextView>(R.id.tv_detail_temperature)
        val tvDetailWeatherDescription = findViewById<TextView>(R.id.tv_detail_weather_description)
        val rlDetailMainLayout = findViewById<RelativeLayout>(R.id.rl_detail_main_layout)

        val cities= intent.getParcelableArrayListExtra<City>("cities")
        val position: Int= intent.getIntExtra("position",-1)

        tvDetailCityName.text = cities?.get(position)?.name
        tvDetailTemperature.text = cities?.get(position)?.weather?.temperature
        tvDetailWeatherDescription.text = cities?.get(position)?.weather?.weatherDescription

        val imageId = applicationContext.resources.getIdentifier(cities?.get(position)?.image,"drawable",applicationContext.packageName)
        val drawableImage= ResourcesCompat.getDrawable(applicationContext.resources,imageId,application.theme)
        rlDetailMainLayout.background= drawableImage


    }
}