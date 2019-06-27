package yidont.kotlin.ch09

/**
 * 类型参数约束
 *
 * @author zwonb
 * @date 2019/6/27
 */
fun <T : Number> oneHalf(value: T): Double {
    return value.toDouble() / 2
}

fun main() {
    println(oneHalf(3))
}