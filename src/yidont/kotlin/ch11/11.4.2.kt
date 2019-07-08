package yidont.kotlin.ch11

import java.time.LocalDate
import java.time.Period

/**
 * 定义一个日期操作的DSL
 *
 * @author zwonb
 * @date 2019/7/8
 */
val Int.days: Period
    get() = Period.ofDays(this)

val Period.ago: LocalDate
    get() = LocalDate.now() - this

val Period.fromNow: LocalDate
    get() = LocalDate.now() + this

fun main() {
    println(1.days.ago)
    println(1.days.fromNow)
}