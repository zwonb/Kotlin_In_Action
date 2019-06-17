package yidont.kotlin.ch06

/**
 * @author zwonb
 * @date 2019/6/17
 */
fun main() {
    val letters = Array<String>(26) { i -> ('a' + i).toString() }
    println(letters.joinToString(""))
}