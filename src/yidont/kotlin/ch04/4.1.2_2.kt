package yidont.kotlin.ch04

interface Clickable1{
    fun click()
    fun showOff() = println("I`m clickable!")
}

open class RichButton1 : Clickable1 {
    /**
     * 不可被重写
     */
    final override fun click() {

    }
}