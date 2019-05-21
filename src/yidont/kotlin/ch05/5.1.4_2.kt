package yidont.kotlin.ch05

/**
 * 说明
 * @author zwonb
 * @date 2019/5/21
 */
fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0
    responses.forEach {
        if (it.startsWith("4")) {
            // lambda 中修改变量
            clientErrors++
        } else if (it.startsWith("5")){
            serverErrors++
        }
    }
    println("$clientErrors client errors, $serverErrors server errors")
}

fun main() {
    val list = listOf("200 OK", "418 I`m a teapot", "500 Internal Server Error")
    printProblemCounts(list)
}