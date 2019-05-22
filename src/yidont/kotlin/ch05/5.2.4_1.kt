package yidont.kotlin.ch05

/**
 * 说明
 * @author zwonb
 * @date 2019/5/22
 */
fun main() {
    val list = listOf("abc", "def")
    println(list.flatMap { it.toList() })
}