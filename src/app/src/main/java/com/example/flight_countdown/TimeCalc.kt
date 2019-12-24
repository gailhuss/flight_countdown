package com.example.flight_countdown

import java.time.LocalDateTime
import java.time.temporal.ChronoUnit


class TimeCalc(private val futureDateTime: LocalDateTime) {
    fun getDiff(currentDateTime: LocalDateTime) : LongArray {
        val days = ChronoUnit.DAYS.between(currentDateTime, this.futureDateTime)

        val diffInHours = ChronoUnit.HOURS.between(currentDateTime, this.futureDateTime)

        val diffInMinutes = ChronoUnit.MINUTES.between(currentDateTime, this.futureDateTime)

        val diffInSeconds = ChronoUnit.SECONDS.between(currentDateTime, this.futureDateTime)

        return longArrayOf(days,
            diffInHours - days * 24,
            diffInMinutes - diffInHours * 60,
            diffInSeconds - diffInMinutes * 60)
    }
}