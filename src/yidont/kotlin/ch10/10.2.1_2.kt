package yidont.kotlin.ch10

/**
 * 反射调用函数
 *
 * @author zwonb
 * @date 2019/7/4
 */
fun foo(x: Int) = println(x)

fun main() {
    val kFunction = ::foo
    kFunction.call(22)
}