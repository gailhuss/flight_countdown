package com.example.flight_countdown

class Logics {
    companion object {
        fun GetBackgroundColorByDaysDiff(daysDiff: Int): Int {
            return when (daysDiff % 8) {
                0 -> R.color.background_day_0
                1 -> R.color.background_day_1
                2 -> R.color.background_day_2
                3 -> R.color.background_day_3
                4 -> R.color.background_day_4
                5 -> R.color.background_day_5
                6 -> R.color.background_day_6
                7 -> R.color.background_day_7
                else -> 0
            }
        }
    }
}