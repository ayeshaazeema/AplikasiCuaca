package com.ayeshaazeema.aplikasicuaca.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ayeshaazeema.aplikasicuaca.R
import com.ayeshaazeema.aplikasicuaca.databinding.LocationItemBinding
import com.ayeshaazeema.aplikasicuaca.model.ListItemDaily

class LocationAdapter(val locationList: ArrayList<ListItemDaily>) :
    RecyclerView.Adapter<LocationAdapter.LocationViewHolder>() {

    class LocationViewHolder(var view: LocationItemBinding) : RecyclerView.ViewHolder(view.root) {

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): LocationAdapter.LocationViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = DataBindingUtil.inflate<LocationItemBinding>(
            inflater, R.layout.location_item, parent, false
        )
        return LocationViewHolder(view)
    }

    override fun onBindViewHolder(holder: LocationAdapter.LocationViewHolder, position: Int) {
        holder.view.locationWeather = locationList[position]
//        holder.view.tvTemperatureLocation.text = locationList[position].main!!.temp!!.toInt().toString()
        holder.itemView.setOnClickListener {  }
    }

    override fun getItemCount(): Int = locationList.size

    fun updateCountryList(newCountryList: List<ListItemDaily>) {
        locationList.clear()
        locationList.addAll(newCountryList)
        notifyDataSetChanged()
    }

}