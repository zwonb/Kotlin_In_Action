package yidont.kotlin.ch02

import java.util.*

fun main(args: Array<String>) {
    val binaryReps = TreeMap<Char, String>()
//    ..语法不只只是int类型，还可以是char类型
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
//        相当于java的 binaryReps.put(c, binary)
        binaryReps[c] = binary
    }
    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }

    println("===== 遍历list =====")

    val list = arrayListOf("10", "11", "1001")
    for ((index, element) in list.withIndex()) {
        println("$index:$element")
    }

}