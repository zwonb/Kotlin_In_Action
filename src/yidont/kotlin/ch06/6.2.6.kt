package yidont.kotlin.ch06

/**
 * 说明
 * @author zwonb
 * @date 2019/5/23
 */

/**
 * Nothing 这个函数永远不返回
 */
fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}

fun main() {
    fail("Error occurred")
}