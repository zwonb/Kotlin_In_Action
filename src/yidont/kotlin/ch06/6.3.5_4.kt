package yidont.kotlin.ch06

/**
 * @author zwonb
 * @date 2019/6/17
 */
fun main() {
    val array = IntArray(5) { i -> (i + 1) * (i + 1) }
    println(array.joinToString())
}