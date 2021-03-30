package com.ayeshaazeema.aplikasicuaca.model

import com.google.gson.annotations.SerializedName

data class ForecastResponse(

	@field:SerializedName("rain")
	val rain: RainResponse? = null,

	@field:SerializedName("visibility")
	val visibility: Int? = null,

	@field:SerializedName("timezone")
	val timezone: Int? = null,

	@field:SerializedName("main")
	val main: MainResponse? = null,

	@field:SerializedName("clouds")
	val clouds: CloudsResponse? = null,

	@field:SerializedName("sys")
	val sys: SysResponse? = null,

	@field:SerializedName("dt")
	val dt: Int? = null,

	@field:SerializedName("coord")
	val coord: CoordResponse? = null,

	@field:SerializedName("weather")
	val weather: List<WeatherItemResponse?>? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("cod")
	val cod: Int? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("base")
	val base: String? = null,

	@field:SerializedName("wind")
	val wind: WindResponse? = null
)

data class CloudsResponse(

	@field:SerializedName("all")
	val all: Int? = null
)

data class WeatherItemResponse(

	@field:SerializedName("icon")
	val icon: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("main")
	val main: String? = null,

	@field:SerializedName("id")
	val id: Int? = null
)

data class SysResponse(

	@field:SerializedName("country")
	val country: String? = null,

	@field:SerializedName("sunrise")
	val sunrise: Int? = null,

	@field:SerializedName("sunset")
	val sunset: Int? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("type")
	val type: Int? = null
)

data class RainResponse(

	@field:SerializedName("1h")
	val jsonMember1h: Double? = null
)

data class CoordResponse(

	@field:SerializedName("lon")
	val lon: Double? = null,

	@field:SerializedName("lat")
	val lat: Double? = null
)

data class MainResponse(

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

data class WindResponse(

	@field:SerializedName("deg")
	val deg: Int? = null,

	@field:SerializedName("speed")
	val speed: Double? = null
)