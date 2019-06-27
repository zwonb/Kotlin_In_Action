package yidont.kotlin.ch09

/**
 * 泛型函数和属性
 *
 * @author zwonb
 * @date 2019/6/27
 */
val <T> List<T>.penultimate: T
    get() = this[size - 2]

fun main() {
    println(listOf(1, 2, 3, 4).penultimate)
}