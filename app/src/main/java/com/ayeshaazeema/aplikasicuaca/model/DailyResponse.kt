package com.ayeshaazeema.aplikasicuaca.model

import com.google.gson.annotations.SerializedName

data class DailyResponse(

	@field:SerializedName("count")
	val count: Int? = null,

	@field:SerializedName("cod")
	val cod: String? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("list")
	val list: List<ListItemDaily?>? = null
)

data class CloudsDaily(

	@field:SerializedName("all")
	val all: Int? = null
)

data class SysDaily(

	@field:SerializedName("country")
	val country: String? = null
)

data class WeatherItemDaily(

	@field:SerializedName("icon")
	val icon: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("main")
	val main: String? = null,

	@field:SerializedName("id")
	val id: Int? = null
)

data class Rain(

	@field:SerializedName("1h")
	val jsonMember1h: Double? = null
)

data class CoordDaily(

	@field:SerializedName("lon")
	val lon: Double? = null,

	@field:SerializedName("lat")
	val lat: Double? = null
)

data class MainDaily(

	@field:SerializedName("temp")
	val temp: Double? = null,

	@field:SerializedName("temp_min")
	val tempMin: Double? = null,

	@field:SerializedName("humidity")
	val humidity: Int? = null,

	@field:SerializedName("pressure")
	val pressure: Int? = null,

	@field:SerializedName("feels_like")
	val feelsLike: Double? = null,

	@field:SerializedName("temp_max")
	val tempMax: Double? = null
)

data class ListItemDaily(

	@field:SerializedName("dt")
	val dt: Int? = null,

	@field:SerializedName("rain")
	val rain: Any? = null,

	@field:SerializedName("coord")
	val coord: CoordDaily? = null,

	@field:SerializedName("snow")
	val snow: Any? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("weather")
	val weather: List<WeatherItemDaily?>? = null,

	@field:SerializedName("main")
	val main: MainDaily? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("clouds")
	val clouds: CloudsDaily? = null,

	@field:SerializedName("sys")
	val sys: SysDaily? = null,

	@field:SerializedName("wind")
	val wind: WindDaily? = null
)

data class WindDaily(

	@field:SerializedName("deg")
	val deg: Int? = null,

	@field:SerializedName("speed")
	val speed: Double? = null
)
