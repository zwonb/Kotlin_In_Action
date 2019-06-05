package yidont.kotlin.ch06

import java.io.BufferedReader
import java.io.StringReader

fun addValidNumbers1(numbers: List<Int?>) {
    val list = numbers.filterNotNull()
    println("总和：${list.sum()}")
    println("无效：${numbers.size - list.size}")
}

fun main() {
    val reader = BufferedReader(StringReader("1\nabc\n42"))
    val numbers = readNumbers(reader)
    addValidNumbers1(numbers)
}