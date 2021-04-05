package com.ayeshaazeema.aplikasicuaca.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ayeshaazeema.aplikasicuaca.model.ListItemDaily

class CityDailyAdapter(val cityDailyList: ArrayList<ListItemDaily>) :
    RecyclerView.Adapter<CityDailyAdapter.CityDailyViewHolder>() {

    inner class CityDailyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CityDailyAdapter.CityDailyViewHolder {
        TODO("Not yet implemented")
    }


    override fun onBindViewHolder(holder: CityDailyAdapter.CityDailyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}