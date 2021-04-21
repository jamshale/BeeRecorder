package com.example.beerecorder.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.beerecorder.R

class TimesAdapter(private val times: ArrayList<Time>) : RecyclerView.Adapter<TimesHolder>() {

    // holder class to hold reference
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        //get view reference
        var times: TextView = view.findViewById(R.id.time_text_view) as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TimesHolder {
        val inflater = LayoutInflater.from(parent.context)
        return TimesHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: TimesHolder, position: Int) {
        val time: Time = times[position]
        holder.bind(time)
    }

    override fun getItemCount(): Int {
        return times.size
    }

    // update your data
    fun updateData(times: ArrayList<Time>) {
        times.clear()
        notifyDataSetChanged()
        times.addAll(times)
        notifyDataSetChanged()

    }
}