package yidont.kotlin.ch04

open class RichButton : Clickable {

    /**
     * 不可重写
     */
    fun disable() {}

    /**
     * 可以被重写
     */
    open fun animate() {}

    override fun click() {

    }
}