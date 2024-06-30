package com.example.sunnyweather.ui.place

import android.view.animation.Transformation
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap
import com.example.sunnyweather.logic.Repository
import com.example.sunnyweather.logic.model.Place

class PlaceViewModel:ViewModel() {
    private val searchLiveData = MutableLiveData<String>()

    val placeList = ArrayList<Place>()
    val placeLiveDate = searchLiveData.switchMap { query ->
        Repository.searchPlaces(query)
    }

    fun searchPlace(query : String){
        searchLiveData.value = query
    }
}