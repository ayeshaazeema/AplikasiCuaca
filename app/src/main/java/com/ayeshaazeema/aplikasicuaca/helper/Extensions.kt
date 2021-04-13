package com.ayeshaazeema.aplikasicuaca.helper

import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.BindingAdapter
import java.text.SimpleDateFormat
import java.util.*

fun DateConverter(): String {
    val date = Calendar.getInstance().time
    val converter = SimpleDateFormat("EEE, d MMM yyyy", Locale("in"))
    val convertedDate = converter.format(date)
    return convertedDate
}

fun DayConverter(time: Long): String {
    val converter = SimpleDateFormat("EEE, d MMM, yyyy hh:mm a")
    val convertedDay = converter.format(Date(time * 1000))
    return convertedDay
}

fun TimeConverter(time: Long): String {
    val converter = SimpleDateFormat("hh:mm a")
    val convertedTime = converter.format(Date(time * 1000))
    return convertedTime
}

@BindingAdapter("android:dayConverter")
fun ConvertToDay(view: TextView, value: Long) {
    val converter = SimpleDateFormat("EEE, d MM yyyy hh:mmm a")
    val convertedDay = converter.format(Date(value * 1000))
    view.text = convertedDay
}

@BindingAdapter("android:converterInt")
fun ConvertToInt(view: TextView, value: Double) {
    val valueInt = value.toInt()
    val valueString = valueInt.toString()
    view.text = valueString
}

fun SetLayoutBackgroundImage(constraintLayout: ConstraintLayout, url: String?) {
    when (url) {
        "01d", "02d", "03d", "04d", "09d", "11d", "13d", "50d" -> {
            constraintLayout.setBackgroundResource(
                constraintLayout.resources.getIdentifier(
                    "ic_background_daylight",
                    "drawable",
                    constraintLayout.context.packageName
                )
            )
        }
    }
}