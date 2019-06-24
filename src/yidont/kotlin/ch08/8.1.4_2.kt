package yidont.kotlin.ch08

/**
 * 函数类型的参数 null 值
 *
 * @author zwonb
 * @date 2019/6/24
 */
fun <T> Collection<T>.joinToString1(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = "",
        transform: ((T) -> String)? = null
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) {
            result.append(separator)
        }
        val str = transform?.invoke(element) ?: element.toString()
        result.append(str)
    }
    result.append(postfix)
    return result.toString()
}

fun main() {
    val letters = listOf("Alpha", "Beta")
    println(letters.joinToString1())
    println(letters.joinToString1 { it.toLowerCase() })
    println(letters.joinToString1(separator = "! ", postfix = "! ",
            transform = { it.toUpperCase() }))
}