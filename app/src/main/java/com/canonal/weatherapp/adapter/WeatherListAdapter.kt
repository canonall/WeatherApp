package com.canonal.weatherapp.adapter

import android.content.Context
import android.content.res.Resources
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.canonal.weatherapp.R
import com.canonal.weatherapp.data.Data
import com.canonal.weatherapp.model.City

class WeatherListAdapter(context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val context: Context = context
    private val cities = Data.getWeatherData(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return WeatherListViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_weather_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is WeatherListViewHolder -> {
                holder.bind(cities[position], context)
            }
        }
    }

    override fun getItemCount(): Int {
        return cities.size
    }

    class WeatherListViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {

        private val tvCityName: TextView =
            itemView.findViewById(R.id.tv_city_name)
        private val tvWeatherDescription: TextView =
            itemView.findViewById(R.id.tv_weather_description)
        private val tvTemperature: TextView =
            itemView.findViewById(R.id.tv_temperature)
        private val ivWeatherIcon: ImageView =
            itemView.findViewById(R.id.iv_weather_icon)
        private val llCityBackground: LinearLayout =
            itemView.findViewById(R.id.ll_city_background)


        fun bind(city: City, context: Context) {
            tvCityName.text = city.name
            tvWeatherDescription.text = city.weather.weatherDescription
            tvTemperature.text = city.weather.temperature
            // ivWeatherIcon.text=city.weather.temperature
            val id =
                context.resources.getIdentifier(city.imageMini, "drawable", context.packageName)
            val drawable = ResourcesCompat.getDrawable(context.resources, id, context.theme)
            llCityBackground.background = drawable
        }
    }
}

