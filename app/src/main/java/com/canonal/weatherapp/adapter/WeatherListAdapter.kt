package com.canonal.weatherapp.adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.canonal.weatherapp.R
import com.canonal.weatherapp.model.City


class WeatherListAdapter(
    private val context: Context,
    private val cities: ArrayList<City>,
    private val onItemClicked: (position: Int) -> Unit
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return WeatherListViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_weather_list_item, parent, false),
            onItemClicked
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is WeatherListViewHolder -> {
                holder.bind(cities[position],context)
            }
        }
    }

    override fun getItemCount(): Int {
        return cities.size
    }

    class WeatherListViewHolder constructor(
        itemView: View,
        private val onItemClicked: (position: Int) -> Unit
    ) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        init {
            itemView.setOnClickListener(this)
        }

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

            val iconId = context.resources.getIdentifier(city.weather.icon,"drawable",context.packageName)
            val drawableIcon= ResourcesCompat.getDrawable(context.resources,iconId,context.theme)
            ivWeatherIcon.setImageDrawable(drawableIcon)

            val imageMiniId = context.resources.getIdentifier(city.imageMini, "drawable", context.packageName)
            val drawableMini = ResourcesCompat.getDrawable(context.resources, imageMiniId, context.theme)
            llCityBackground.background = drawableMini

        }

        override fun onClick(v: View?) {
            val position = absoluteAdapterPosition
            onItemClicked(position)
        }

    }
}

