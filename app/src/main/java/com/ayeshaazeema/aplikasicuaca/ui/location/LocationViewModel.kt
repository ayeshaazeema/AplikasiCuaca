package com.ayeshaazeema.aplikasicuaca.ui.location

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ayeshaazeema.aplikasicuaca.model.DailyResponse
import com.ayeshaazeema.aplikasicuaca.model.ListItemDaily
import com.ayeshaazeema.aplikasicuaca.network.RetrofitConfig
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.observers.DisposableSingleObserver
import io.reactivex.rxjava3.schedulers.Schedulers

class LocationViewModel : ViewModel() {

    private val apiClient = RetrofitConfig()
    private val disposable = CompositeDisposable()

    val locationDailyLiveData = MutableLiveData<List<ListItemDaily>>()
    var locationDailyLiveDataList: List<ListItemDaily> = ArrayList()
    val locationDailyLoading = MutableLiveData<Boolean>()

    fun GetLocationDailyFromGPS(latitude: String, longitude: String, cnt: String, units: String) {
        locationDailyLoading.value = true
        disposable.add(apiClient
            .getDailyFromGPS(latitude, longitude, cnt, units)
            .subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(object : DisposableSingleObserver<DailyResponse>() {
                override fun onSuccess(t: DailyResponse) {
                    var locationDailyResponse = t
                    locationDailyLiveDataList = locationDailyResponse.list as List<ListItemDaily>
                    locationDailyLiveData.value = locationDailyLiveDataList
                    locationDailyLoading.value = false
                    Log.i("Processing Daily Data", "Success")
                }

                override fun onError(e: Throwable) {
                    Log.i("Daily Data", "Failed")
                }
            }
            ))
    }

    override fun onCleared() {
        super.onCleared()
        disposable.clear()
    }
}