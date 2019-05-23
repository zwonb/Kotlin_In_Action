package yidont.kotlin.ch06

/**
 * 说明
 * @author zwonb
 * @date 2019/5/23
 */
fun main() {
    val x = 1
    println(x.toLong() in listOf(1L, 2L, 3L))

    val b: Byte = 1
    val l = b + 1L
    println(l.javaClass)
    foo(42)

    println("42".toInt())
}

fun foo(l: Long) = println(l)