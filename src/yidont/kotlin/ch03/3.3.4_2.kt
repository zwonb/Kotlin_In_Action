package yidont.kotlin.ch03

/**
 * 拓展函数不可被重写
 */

fun View.showOff() = println("I`m a view!")

fun Button.showOff() = println("I`m a button!")

fun main(args: Array<String>) {
    val view: View = Button()
    // 输入的是 I`m a view!
    println(view.showOff())
}