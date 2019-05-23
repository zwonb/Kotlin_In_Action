package yidont.kotlin.ch06

/**
 * 说明
 * @author zwonb
 * @date 2019/5/23
 */
fun strLenSafe1(s: String?): Int = s?.length ?: 0

fun main() {
    println(strLenSafe1("abc"))
    println(strLenSafe1(null))
}