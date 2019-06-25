package yidont.kotlin.ch08

/**
 * 带标签的“this”表达式明
 *
 * @author zwonb
 * @date 2019/6/25
 */
fun main() {
    println(StringBuilder().apply sb@{
        listOf(1, 2, 3).apply {
            this@sb.append(this.toString())
        }
    })
}