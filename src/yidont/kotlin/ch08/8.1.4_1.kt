package yidont.kotlin.ch08

/**
 * 函数类型的参数默认值
 *
 * @author zwonb
 * @date 2019/6/24
 */
fun <T> Collection<T>.joinToString(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = "",
        transform: (T) -> String = { it.toString() }
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) {
            result.append(separator)
        }
        result.append(transform(element))
    }
    result.append(postfix)
    return result.toString()
}

fun main() {
    val list = listOf("zwonb", "hello")
    println(list.joinToString())
    println(list.joinToString { it.toString() })
    println(list.joinToString(separator = "! ", postfix = "! ", transform = { it.toUpperCase() }))
}