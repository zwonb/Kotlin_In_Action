package yidont.kotlin.ch05

/**
 * 在作用域访问变量
 * @author zwonb
 * @date 2019/5/21
 */
fun printMessagesWithPrefix(message: Collection<String>, prefix: String) {
    message.forEach {
        println("$prefix $it")
    }
}


fun main() {
    val list = listOf("403 Forbidden", "404 Not Found")
    printMessagesWithPrefix(list, "Error:")
}