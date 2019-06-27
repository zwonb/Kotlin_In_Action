package yidont.kotlin.ch09

/**
 * 声明带实化类型参数的函数
 *
 * @author zwonb
 * @date 2019/6/27
 */
fun main() {
    val list = listOf(1, "2", 3, "4")
    println(list.filterIsInstance<String>())
}