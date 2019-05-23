package yidont.kotlin.ch06

/**
 * 说明
 * @author zwonb
 * @date 2019/5/23
 */
fun printAllCaps(s: String?) {
    val allCaps = s?.toUpperCase()
    println(allCaps)
}

fun main() {
    printAllCaps("zwonb")
    printAllCaps(null)
}