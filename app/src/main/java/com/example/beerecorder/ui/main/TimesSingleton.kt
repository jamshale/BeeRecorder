package com.example.beerecorder.ui.main

class TimesSingleton() {

    var times = ArrayList<Time>()

    private object HOLDER {
        val INSTANCE = TimesSingleton()
    }

    companion object {
        val instance: TimesSingleton by lazy { HOLDER.INSTANCE }
    }
}