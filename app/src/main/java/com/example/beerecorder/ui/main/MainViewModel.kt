package com.example.beerecorder.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var currentStartTime = ""
    var currentEndTime = ""
    fun recordTouch(bee: String) {
        Log.i("BEE", bee)
        Log.i("Start time:", System.currentTimeMillis().toString())
        currentStartTime = System.currentTimeMillis().toString()
    }

    fun endTouch(bee: String) {
        Log.i("DONE", "FINISHED " + bee)
        Log.i("End time:", System.currentTimeMillis().toString())
        currentEndTime = System.currentTimeMillis().toString()
        TimesSingleton.instance.times.add(Time(bee, currentStartTime, currentEndTime))
    }




}
