package yidont.kotlin.ch06

/**
 * 说明
 * @author zwonb
 * @date 2019/5/23
 */
fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank()) {
        println("输入为空")
    }
}

fun main() {
    verifyUserInput(" ")
    verifyUserInput(null)
}