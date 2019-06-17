package yidont.kotlin.ch07

/**
 * @author zwonb
 * @date 2019/6/17
 */
data class Point1(val x: Int, val y: Int)

operator fun Point1.plus(other: Point1): Point1 {
    return Point1(other.x, other.y + y)
}

fun main() {
    val point = Point1(10, 20)
    val point1 = Point1(30, 40)
    println(point + point1)
}