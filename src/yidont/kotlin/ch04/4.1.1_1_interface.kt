package yidont.kotlin.ch04

interface Clickable {

    fun click()

    fun showOff() = println("I'm clickable!")
}

interface Focusable {

    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("I'm focusable!")
}

private class Button : Clickable {

    override fun click() = println("I was clicked")
}

private class Button1 : Clickable, Focusable {

    override fun click() = println("I was clicked")

    override fun showOff() {
        // 两个接口都有同样的默认实现函数，必须要显式实现
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

fun main(args: Array<String>) {
    Button().click()

    val button1 = Button1()
    button1.showOff()
    button1.setFocus(true)
    button1.click()
}