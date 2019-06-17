package yidont.kotlin.ch06

/**
 * @author zwonb
 * @date 2019/6/17
 */
fun main() {
    val list = listOf("a", "b", "c")
    println("%s %s %s".format(*list.toTypedArray()))
}