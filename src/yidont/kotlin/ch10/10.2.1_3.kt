package yidont.kotlin.ch10

/**
 * 反射调用属性
 *
 * @author zwonb
 * @date 2019/7/4
 */
var counter = 0

fun main() {
    val kProperty = ::counter
    kProperty.setter.call(22)
    println(kProperty.get())
}