package yidont.kotlin.ch11

/**
 * 带接收者的lambda为参数的buildString()
 *
 * @author zwonb
 * @date 2019/7/4
 */
fun buildString1(builderAction: StringBuilder.() -> Unit): String {
    val sb = StringBuilder()
    sb.builderAction()
    return sb.toString()
}

fun main() {
    val s = buildString1 {
        append("Hello,")
        append("World!")
    }
    println(s)
}

