package yidont.kotlin.ch09

/**
 * 星号投影
 *
 * @author zwonb
 * @date 2019/6/28
 */
fun printFirst(list: List<*>) {
    if (list.isNotEmpty()) {
        println(list.first())
    }
}

fun <T> printFirst1(list: List<T>) {
    if (list.isNotEmpty()) {
        println(list.first())
    }
}

fun main() {
    printFirst(listOf("zwonb", "bob"))
    printFirst1(listOf("zwonb", 1))
}