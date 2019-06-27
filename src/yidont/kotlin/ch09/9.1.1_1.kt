package yidont.kotlin.ch09

/**
 * 泛型函数和属性
 *
 * @author zwonb
 * @date 2019/6/27
 */
fun main() {
    val list = ('a'..'z').toList()
    println(list.slice<Char>(0..2))
    println(list.slice(0..2))
}