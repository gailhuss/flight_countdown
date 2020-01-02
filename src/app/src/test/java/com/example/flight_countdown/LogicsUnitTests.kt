package com.example.flight_countdown

import org.junit.Assert
import org.junit.Test

class LogicsUnitTests {
    @Test
    fun GetBackgroundColorByDaysDiff_IsCorrect() {
        var result = Logics.GetBackgroundColorByDaysDiff(8)
        Assert.assertEquals(result, 2130968602) //0

        result = Logics.GetBackgroundColorByDaysDiff(9)
        Assert.assertEquals(result, 2130968603) //1

        result = Logics.GetBackgroundColorByDaysDiff(10)
        Assert.assertEquals(result, 2130968604) //2

        result = Logics.GetBackgroundColorByDaysDiff(11)
        Assert.assertEquals(result, 2130968605) //3

        result = Logics.GetBackgroundColorByDaysDiff(12)
        Assert.assertEquals(result, 2130968606) //4

        result = Logics.GetBackgroundColorByDaysDiff(13)
        Assert.assertEquals(result, 2130968607) //5

        result = Logics.GetBackgroundColorByDaysDiff(14)
        Assert.assertEquals(result, 2130968608) //6

        result = Logics.GetBackgroundColorByDaysDiff(15)
        Assert.assertEquals(result, 2130968609) //7
    }
}