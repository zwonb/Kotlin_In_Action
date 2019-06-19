package yidont.kotlin.ch07

/**
 * 结构声明和组件函数
 *
 * @author zwonb
 * @date 2019/6/19
 */
fun main() {
    val point = Point(10, 20)
    val (x, y) = point
    println(x)
    println(y)
}