package yidont.kotlin.ch11

/**
 * 定义以lambda为参数的buildString()
 *
 * @author zwonb
 * @date 2019/7/4
 */
fun buildString(builderAction: (StringBuilder) -> Unit): String {
    val sb = StringBuilder()
    builderAction(sb)
    return sb.toString()
}

fun main() {
    val s = buildString {
        it.append("Hello,")
        it.append("World!")
    }
    println(s)
}