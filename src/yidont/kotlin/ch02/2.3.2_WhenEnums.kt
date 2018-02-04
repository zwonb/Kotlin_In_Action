package yidont.kotlin.ch02

import yidont.kotlin.ch02.Color2.*

enum class Color2 {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun getMnemonic(color: Color2) =
        when (color) {
            Color2.RED -> "Richard"
            Color2.ORANGE -> "Of"
            Color2.YELLOW -> "York"
            Color2.GREEN -> "Gave"
            Color2.BLUE -> "Battle"
            Color2.INDIGO -> "In"
            Color2.VIOLET -> "Vain"
        }

fun getWarmth(color: Color2) = when (color) {
// 导入枚举包就可以直接使用名称
    RED, ORANGE, YELLOW -> "warm"
    GREEN -> "neutral"
    Color2.BLUE, INDIGO, VIOLET -> "cold"
}

fun main(args: Array<String>) {
    println(getMnemonic(Color2.BLUE))

    println(getWarmth(ORANGE))
}