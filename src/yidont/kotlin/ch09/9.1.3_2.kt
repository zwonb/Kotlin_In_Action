package yidont.kotlin.ch09

/**
 * 声明带类型参数约束的函数
 *
 * @author zwonb
 * @date 2019/6/27
 */
fun <T : Comparable<T>> max(first: T, second: T): T {
    return if (first > second) first else second
}

fun main() {
    println(max("kotlin", "java"))
}