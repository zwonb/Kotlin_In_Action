package yidont.kotlin.ch07

import java.time.LocalDate

/**
 * 在“for”循环中使用“ iterator”的约定
 *
 * @author zwonb
 * @date 2019/6/18
 */
operator fun ClosedRange<LocalDate>.iterator():Iterator<LocalDate> =
        object :Iterator<LocalDate>{
            var current = start
            override fun hasNext(): Boolean = current <= endInclusive

            override fun next(): LocalDate = current.apply {
                current = plusDays(1)
            }
        }

fun main() {
    val date = LocalDate.ofYearDay(2017, 1)
    val daysOff = date.minusDays(1)..date
    for (day in daysOff) {
        println(day)
    }
}