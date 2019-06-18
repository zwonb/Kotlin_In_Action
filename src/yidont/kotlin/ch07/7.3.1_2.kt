package yidont.kotlin.ch07

/**
 * 通过下标来访问元素：“get”和“set”
 *
 * @author zwonb
 * @date 2019/6/18
 */
data class MutablePoint(var x: Int, var y: Int)

operator fun MutablePoint.set(index: Int, value: Int) {
    when (index) {
        0 -> x = value
        1 -> y = value
        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

fun main() {
    val point = MutablePoint(10, 20)
    point[1] = 42
    println(point)
}