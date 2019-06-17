package yidont.kotlin.ch07

/**
 * @author zwonb
 * @date 2019/6/17
 */
operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

fun main() {
    println('a' * 3)
}