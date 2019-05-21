package yidont.kotlin.ch05

/**
 * 成员引用
 * @author zwonb
 * @date 2019/5/21
 */
fun salute() = println("salute")

fun main() {
    // 引用顶层函数
    run(::salute)
}