package yidont.kotlin.ch08

/**
 * String filter 函数
 *
 * @author zwonb
 * @date 2019/6/24
 */
fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (i in 0 until length) {
        val element = get(i)
        if (predicate(element)) {
            sb.append(element)
        }
    }
    return sb.toString()
}

fun main() {
    println("ab1c".filter { it in 'a'..'z' })
}