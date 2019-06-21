package yidont.kotlin.ch08

/**
 * 调用作为参数的函数
 *
 * @author zwonb
 * @date 2019/6/21
 */
fun towAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println("结果为$result")
}

fun main() {
    towAndThree { a, b -> a + b }
    towAndThree { a, b -> a * b }
}