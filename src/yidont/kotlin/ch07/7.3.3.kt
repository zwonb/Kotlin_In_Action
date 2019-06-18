package yidont.kotlin.ch07

/**
 * rangeTo 的约定
 *
 * @author zwonb
 * @date 2019/6/18
 */
fun main() {
    val n = 9
    println(0..(n+1))

    (0..n).forEach { println(it) }
}