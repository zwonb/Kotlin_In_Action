package yidont.kotlin.ch11

/**
 * 说明
 *
 * @author zwonb
 * @date 2019/7/4
 */
fun main() {
    val map = mutableMapOf(1 to "one")
    map.apply { this[2] = "two" }
    with(map) { this[3] = "three" }
    println(map)
}