package com.example.beerecorder.ui.main

import android.content.Intent
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import com.example.beerecorder.R
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }



    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        initializeTouchListeners()

    }

    private fun switchFragment() {
        val intent = Intent(activity, TimesActivity::class.java)

        startActivity(intent)
    }


    private fun initializeTouchListeners() {
        buttonWH.setOnTouchListener { v, event ->
            when (event?.action) {
                MotionEvent.ACTION_DOWN -> //Do Something
                    viewModel.recordTouch("WH")

                MotionEvent.ACTION_UP -> {
                    v?.performClick()
                    viewModel.endTouch("WH")
                }
            }

            v?.onTouchEvent(event) ?: true
        }
        buttonYFB.setOnTouchListener { v, event ->
            when (event?.action) {
                MotionEvent.ACTION_DOWN -> //Do Something
                    viewModel.recordTouch("YFB")

                MotionEvent.ACTION_UP -> {
                    v?.performClick()
                    viewModel.endTouch("YFB")
                }
            }

            v?.onTouchEvent(event) ?: true
        }
        buttonWSB.setOnTouchListener { v, event ->
            when (event?.action) {
                MotionEvent.ACTION_DOWN -> //Do Something
                    viewModel.recordTouch("WSB")

                MotionEvent.ACTION_UP -> {
                    v?.performClick()
                    viewModel.endTouch("WSB")
                }
            }

            v?.onTouchEvent(event) ?: true
        }
        buttonTFB.setOnTouchListener { v, event ->
            when (event?.action) {
                MotionEvent.ACTION_DOWN -> //Do Something
                    viewModel.recordTouch("TFB")

                MotionEvent.ACTION_UP -> {
                    v?.performClick()
                    viewModel.endTouch("TFB")
                }
            }

            v?.onTouchEvent(event) ?: true
        }
        buttonMB.setOnTouchListener { v, event ->
            when (event?.action) {
                MotionEvent.ACTION_DOWN -> //Do Something
                    viewModel.recordTouch("MB")

                MotionEvent.ACTION_UP -> {
                    v?.performClick()
                    viewModel.endTouch("MB")
                }
            }

            v?.onTouchEvent(event) ?: true
        }
        buttonCEB.setOnTouchListener { v, event ->
            when (event?.action) {
                MotionEvent.ACTION_DOWN -> //Do Something
                    viewModel.recordTouch("CEB")

                MotionEvent.ACTION_UP -> {
                    v?.performClick()
                    viewModel.endTouch("CEB")
                }
            }

            v?.onTouchEvent(event) ?: true
        }
        buttonBTB.setOnTouchListener { v, event ->
            when (event?.action) {
                MotionEvent.ACTION_DOWN -> //Do Something
                    viewModel.recordTouch("BTB")

                MotionEvent.ACTION_UP -> {
                    v?.performClick()
                    viewModel.endTouch("BTB")
                }
            }

            v?.onTouchEvent(event) ?: true
        }

        buttonTimes.setOnTouchListener { v, event ->
            when (event?.action) {
                MotionEvent.ACTION_DOWN -> {}

                MotionEvent.ACTION_UP -> {
                    v?.performClick()
                    this.switchFragment()
                }
            }

            v?.onTouchEvent(event) ?: true
        }
    }

}
