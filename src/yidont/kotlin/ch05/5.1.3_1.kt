package yidont.kotlin.ch05

/**
 * 说明
 * @author zwonb
 * @date 2019/5/21
 */
fun main() {
    val sum = { x: Int, y: Int -> x + y }
    println(sum(1, 2))
}