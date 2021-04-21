package com.example.beerecorder.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.beerecorder.R

class TimesHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.list_item, parent, false)) {
        private var speciesView: TextView? = null
        private var startView: TextView? = null
        private var endView: TextView? = null


        init {
            speciesView = itemView.findViewById(R.id.species)
            startView = itemView.findViewById(R.id.start_time)
            endView = itemView.findViewById(R.id.end_time)
        }

        fun bind(time: Time) {
            speciesView?.text = time.species
            startView?.text = time.start
            endView?.text = time.end
        }

}