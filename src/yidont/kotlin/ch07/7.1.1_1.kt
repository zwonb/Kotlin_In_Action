package yidont.kotlin.ch07

/**
 * 重载二元算术运算
 *
 * @author zwonb
 * @date 2019/6/17
 */
data class Point(val x: Int, val y: Int) {

    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

fun main() {
    val point = Point(10, 20)
    val point1 = Point(30, 40)
    println(point + point1)
}