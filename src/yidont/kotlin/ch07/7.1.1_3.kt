package yidont.kotlin.ch07

/**
 * @author zwonb
 * @date 2019/6/17
 */
operator fun Point1.times(scale: Double): Point1 {
    return Point1((x * scale).toInt(), (y * scale).toInt())
}

fun main() {
    val point1 = Point1(10, 20)
    println(point1 * 1.5)
}