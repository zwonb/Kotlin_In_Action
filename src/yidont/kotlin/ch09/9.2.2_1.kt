package yidont.kotlin.ch09

/**
 * 声明带实化类型参数的函数
 *
 * @author zwonb
 * @date 2019/6/27
 */

/**
 * “reified”声明了类型参数不会在运行时被擦除
 */
inline fun <reified T> isT(value: Any) = value is T

fun main() {
    println(isT<String>(1))
    println(isT<String>("1"))
}