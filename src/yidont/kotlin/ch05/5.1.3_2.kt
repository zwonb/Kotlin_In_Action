package yidont.kotlin.ch05

/**
 * 说明
 * @author zwonb
 * @date 2019/5/21
 */
fun main() {
    { println("hello") }()
    // 直接调用里面表达式
    run { println("hello") }
}