package yidont.kotlin.ch07

/**
 * 通过下标来访问元素：“get”和“set”
 *
 * @author zwonb
 * @date 2019/6/18
 */
operator fun Point.get(index: Int): Int {
    return when (index) {
        0 -> x
        1 -> y
        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

fun main() {
    val point = Point(1, 2)
    println(point[1])
}