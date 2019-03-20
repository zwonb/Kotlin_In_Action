package yidont.kotlin.ch03

/**
 * 不可重写的拓展函数
 */

open class View {
    open fun onClick() = println("View clicked")
}

class Button : View() {
    override fun onClick() = println("Button clicked")
}

fun main(args: Array<String>) {
    val view: View = Button()
    // 输入 Button clicked
    view.onClick()
}