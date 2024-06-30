package com.example.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication:Application() {
    companion object{
        const val TOKEN = "D93HY1C7xF6tvYV5"
        @SuppressLint("StaticFieldLeak")
        lateinit var context : Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}