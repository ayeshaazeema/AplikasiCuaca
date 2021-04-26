package com.ayeshaazeema.aplikasicuaca.ui.location

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.ayeshaazeema.aplikasicuaca.R
import com.ayeshaazeema.aplikasicuaca.databinding.FragmentLocationBinding
import im.delight.android.location.SimpleLocation

class LocationFragment : Fragment() {

    private val REQUEST_CODE = 1

    private lateinit var locationViewModel: LocationViewModel
    private lateinit var locationDataBinding: FragmentLocationBinding

    var location: SimpleLocation? = null
    var latitude: String? = null
    var longitude: String? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        locationDataBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_location, container, false)
        return locationDataBinding.root
    }
}