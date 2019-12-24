package com.example.flight_countdown

import org.junit.Assert
import org.junit.Test
import java.time.LocalDateTime

class TimeCalcUnitTest {
    @Test
    fun getDiff_isCorrect() {
        val calc = TimeCalc(LocalDateTime.parse("2020-01-19T10:25:00"))

        val result = calc.getDiff(LocalDateTime.parse("2020-01-17T09:23:50"))
        Assert.assertArrayEquals(longArrayOf(2, 1, 1, 10), result)
    }
}