package yidont.kotlin.ch07

/**
 * 等号运算符：“equals”
 *
 * @author zwonb
 * @date 2019/6/18
 */
class Point3(val x: Int, val y: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Point3) return false
        return other.x == x && other.y == y
    }
}

fun main() {
    println(Point3(1, 2) == Point3(1, 2))
    println(Point3(1, 2) != Point3(3, 4))
    println(Point3(1, 2) == null)
}