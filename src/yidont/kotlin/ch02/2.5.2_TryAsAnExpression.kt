package yidont.kotlin.ch02

import java.io.BufferedReader
import java.io.StringReader

private fun readNumber(reader: BufferedReader) {
//    try 作为表达式
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
//        抛出异常，执行下面什么都没有
        return
    }
    println(number)
}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("not a number"))
    readNumber(reader)
}