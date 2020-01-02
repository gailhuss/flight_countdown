package com.example.flight_countdown

import android.os.Bundle
import android.os.CountDownTimer
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.time.LocalDateTime


class MainActivity : AppCompatActivity() {
    private val calculator = TimeCalc(LocalDateTime.parse("2020-01-19T10:25:00"))
    private lateinit var timer: CountDownTimer
    private val totalColors = 8

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        initTimer()
        setTime()
    }

    override fun onPause() {
        super.onPause()
        timer.cancel()
    }

    private fun initTimer()
    {
        timer = object : CountDownTimer(15*60*1000, 1000) {
            override fun onFinish() {
            }

            override fun onTick(millisUntilFinished: Long) {
                setTime()
            }
        }.start()
    }

    private fun setTime()
    {
        val diff = calculator.getDiff(LocalDateTime.now())
        daysView.text = diff[0].toString()

        hoursView.text = diff[1].toString()

        minutesView.text = diff[2].toString()

        secondsView.text = diff[3].toString()

        setBackColor(diff[0].toInt())
    }

    private fun setBackColor(daysDiff: Int) {
        if(daysDiff != 0) {
            val resColor = Logics.GetBackgroundColorByDaysDiff(daysDiff)

            rootLayout.setBackgroundColor(getColor(resColor))
        }
    }

}
