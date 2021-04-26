package com.ayeshaazeema.aplikasicuaca.network

import com.ayeshaazeema.aplikasicuaca.BuildConfig
import com.ayeshaazeema.aplikasicuaca.model.DailyResponse
import com.ayeshaazeema.aplikasicuaca.model.ForecastResponse
import com.ayeshaazeema.aplikasicuaca.model.WeatherResponse
import io.reactivex.rxjava3.core.Single
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitConfig {
    private val api = Retrofit.Builder().baseUrl(BuildConfig.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
        .client(getOkHttpClient())
        .build()
        .create(ApiService::class.java)

    fun getForecastFromGPS(
        latitude: String,
        longitude: String,
        units: String
    ): Single<ForecastResponse> {
        return api.getForecastByGPS(latitude, longitude, units)
    }

    fun getDataFromGPS(
        latitude: String,
        longitude: String,
        units: String
    ): Single<WeatherResponse> {
        return api.getWeatherByGPS(latitude, longitude, units)
    }

    fun getDailyFromGPS(
        latitude: String,
        longitude: String,
        cnt: String,
        units: String
    ): Single<DailyResponse> {
        return api.getDailyFromGPS(latitude, longitude, cnt, units)
    }

    private fun getOkHttpClient(): OkHttpClient {
        val client = OkHttpClient.Builder()
        client.addInterceptor(RequestInterceptor())
        return client.build()
    }
}