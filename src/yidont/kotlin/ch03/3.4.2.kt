package yidont.kotlin.ch03

/**
 * 可变参数
 */

fun main(args: Array<String>) {
    // * 展开运算符
    val listOf = listOf("args:", *args)
    println(listOf)

    // 解构
    val (name,value) = "1" to listOf
    println(name)
    println(value)
}