package yidont.kotlin.ch09

/**
 * 为什么存在变型：给函数传递实参
 *
 * @author zwonb
 * @date 2019/6/27
 */
fun printContents(list: List<Any>) {
    println(list.joinToString())
}

fun main() {
    printContents(listOf("abc", "bac"))
}