package yidont.kotlin.ch11

/**
 * 用变量保存带接收者的lambda
 *
 * @author zwonb
 * @date 2019/7/4
 */
val appendExcl: StringBuilder.() -> Unit = { this.append("!") }

fun main() {
    val stringBuilder = StringBuilder("Hi!")
    stringBuilder.appendExcl()
    println(stringBuilder)
    println(buildString1(appendExcl))
}