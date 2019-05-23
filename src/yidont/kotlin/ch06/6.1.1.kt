package yidont.kotlin.ch06

/**
 * 可空类型
 * @author zwonb
 * @date 2019/5/23
 */
fun strLenSafe(s: String?): Int =
        if (s != null) s.length else 0

fun main() {
    val x: String? = null
    println(strLenSafe(x))
    println(strLenSafe("zwonb"))
}