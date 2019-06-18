package yidont.kotlin.ch07

import java.math.BigDecimal

/**
 * @author zwonb
 * @date 2019/6/18
 */
operator fun BigDecimal.inc() = this + BigDecimal.ONE

fun main() {
    var decimal = BigDecimal.ZERO
    println(decimal++)
    println(++decimal)
}