package yidont.kotlin.ch07

/**
 * 解构声明和循环
 *
 * @author zwonb
 * @date 2019/6/19
 */
fun printEntries1(map: Map<String, String>) {
    for ((key, value) in map) {
        println("$key -> $value")
    }
}

fun main() {
    val map = mapOf("Oracle" to "Java", "JetBrains" to "Kotlin")
    printEntries1(map)
}