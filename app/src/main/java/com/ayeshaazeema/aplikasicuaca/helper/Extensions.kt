package com.ayeshaazeema.aplikasicuaca.helper

import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.BindingAdapter
import com.ayeshaazeema.aplikasicuaca.R
import com.bumptech.glide.Glide
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


@BindingAdapter("layoutBackgroundImage")
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
        "8801n", "02n", "03n", "04n", "09n", "11n", "13n", "50n" -> {
            constraintLayout.setBackgroundResource(
                constraintLayout.resources.getIdentifier(
                    "ic_background_night",
                    "drawable",
                    constraintLayout.context.packageName
                )
            )
        }
    }
}

@BindingAdapter("backgroundResources")
fun SetBackgroundResource(constraintLayout: ConstraintLayout, url: String) {
    when (url) {
        "01d" -> constraintLayout.setBackgroundResource(
            constraintLayout.resources.getIdentifier(
                "background_sunny_weather",
                "drawable",
                constraintLayout.context.packageName
            )
        )
        "01n" -> constraintLayout.setBackgroundResource(
            constraintLayout.resources.getIdentifier(
                "background_night",
                "drawable",
                constraintLayout.context.packageName
            )
        )
        "02d" -> constraintLayout.setBackgroundResource(
            constraintLayout.resources.getIdentifier(
                "background_sunny_weather",
                "drawable",
                constraintLayout.context.packageName
            )
        )
        "02n" -> constraintLayout.setBackgroundResource(
            constraintLayout.resources.getIdentifier(
                "background_night",
                "drawable",
                constraintLayout.context.packageName
            )
        )
        "03d" -> constraintLayout.setBackgroundResource(
            constraintLayout.resources.getIdentifier(
                "background_sunny_weather",
                "drawable",
                constraintLayout.context.packageName
            )
        )
        "03n" -> constraintLayout.setBackgroundResource(
            constraintLayout.resources.getIdentifier(
                "background_night",
                "drawable",
                constraintLayout.context.packageName
            )
        )
        "04d" -> constraintLayout.setBackgroundResource(
            constraintLayout.resources.getIdentifier(
                "background_sunny_weather",
                "drawable",
                constraintLayout.context.packageName
            )
        )
        "04n" -> constraintLayout.setBackgroundResource(
            constraintLayout.resources.getIdentifier(
                "background_night",
                "drawable",
                constraintLayout.context.packageName
            )
        )
        "09d" -> constraintLayout.setBackgroundResource(
            constraintLayout.resources.getIdentifier(
                "background_sunny_weather",
                "drawable",
                constraintLayout.context.packageName
            )
        )
        "09n" -> constraintLayout.setBackgroundResource(
            constraintLayout.resources.getIdentifier(
                "background_night",
                "drawable",
                constraintLayout.context.packageName
            )
        )
        "10d" -> constraintLayout.setBackgroundResource(
            constraintLayout.resources.getIdentifier(
                "background_sunny_weather",
                "drawable",
                constraintLayout.context.packageName
            )
        )
        "10n" -> constraintLayout.setBackgroundResource(
            constraintLayout.resources.getIdentifier(
                "background_night",
                "drawable",
                constraintLayout.context.packageName
            )
        )
        "11d" -> constraintLayout.setBackgroundResource(
            constraintLayout.resources.getIdentifier(
                "background_sunny_weather",
                "drawable",
                constraintLayout.context.packageName
            )
        )
        "11n" -> constraintLayout.setBackgroundResource(
            constraintLayout.resources.getIdentifier(
                "background_night",
                "drawable",
                constraintLayout.context.packageName
            )
        )
        "13d" -> constraintLayout.setBackgroundResource(
            constraintLayout.resources.getIdentifier(
                "background_sunny_weather",
                "drawable",
                constraintLayout.context.packageName
            )
        )
        "13n" -> constraintLayout.setBackgroundResource(
            constraintLayout.resources.getIdentifier(
                "background_night",
                "drawable",
                constraintLayout.context.packageName
            )
        )
        "50d" -> constraintLayout.setBackgroundResource(
            constraintLayout.resources.getIdentifier(
                "background_sunny_weather",
                "drawable",
                constraintLayout.context.packageName
            )
        )
        "50n" -> constraintLayout.setBackgroundResource(
            constraintLayout.resources.getIdentifier(
                "background_night",
                "drawable",
                constraintLayout.context.packageName
            )
        )
    }
}

fun SetImageResource(imageView: ImageView, url: String) {
    when (url) {
        "01d" -> imageView.setImageDrawable(imageView, R.drawable.ic_01d)
    }
}

private fun ImageView.setImageDrawable(imageView: ImageView, icon: Int) {
    Glide.with(context).load(icon).into(imageView)
}
