package yidont.kotlin.ch07

/**
 * 重载一元运算符
 *
 * @author zwonb
 * @date 2019/6/18
 */
operator fun Point2.unaryMinus(): Point2 {
    return Point2(-x, -y)
}

fun main() {
    val point = Point2(1, 2)
    println(-point)
}