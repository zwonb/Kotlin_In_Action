package yidont.kotlin.ch07

/**
 * 重载复合赋值运算符
 *
 * @author zwonb
 * @date 2019/6/18
 */
data class Point2(val x: Int, val y: Int)

operator fun Point2.plus(other: Point2): Point2 {
    return Point2(other.x + x, other.y + y)
}

fun main() {
    var point = Point2(1, 2)
    point += Point2(3, 4)
    println(point)
}
