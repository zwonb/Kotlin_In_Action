package yidont.kotlin.ch09

/**
 * 对已知类型实参做类型转换
 *
 * @author zwonb
 * @date 2019/6/27
 */
fun printSum1(c: Collection<Int>) {
    if (c is List<Int>) {
        println(c.sum())
    }
}

fun main() {
    printSum1(listOf(1, 2, 3))
}