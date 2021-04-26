package com.ayeshaazeema.aplikasicuaca.network

import com.ayeshaazeema.aplikasicuaca.model.DailyResponse
import com.ayeshaazeema.aplikasicuaca.model.ForecastResponse
import com.ayeshaazeema.aplikasicuaca.model.WeatherResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("weather?")
    fun getWeatherByGPS(
        @Query("lat") latitude: String,
        @Query("lon") longitude: String,
        @Query("units") units: String
    ): Single<WeatherResponse>

    @GET("forecast?")
    fun getForecastByGPS(
        @Query("lat") latitude: String,
        @Query("lon") longitude: String,
        @Query("units") units: String
    ): Single<ForecastResponse>

    @GET("find?")
    fun getDailyFromGPS(
        @Query("lat") latitude: String,
        @Query("lon") longitude: String,
        @Query("cnt") cnt: String,
        @Query("units") units: String
    ): Single<DailyResponse>
}