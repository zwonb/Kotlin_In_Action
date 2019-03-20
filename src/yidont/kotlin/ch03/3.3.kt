package yidont.kotlin.ch03

/**
 * 拓展函数
 */

fun String.lastChar(): Char = this[length-1]

fun main(args: Array<String>) {
    println("Kotlin".lastChar())
}