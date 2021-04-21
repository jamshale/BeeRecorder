package com.example.beerecorder.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.beerecorder.R
import com.example.beerecorder.ui.main.MainFragment
import com.example.beerecorder.ui.main.TimesFragment
import kotlinx.android.synthetic.main.times_activity.*

class TimesActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.times_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, TimesFragment.newInstance())
                .commitNow()
        }
    }

}
