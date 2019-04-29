package yidont.kotlin.ch04

abstract class Animated {

    /**
     * 抽象函数默认是 open
     */
    abstract fun animate()

    open fun stopAnimate() {}

    /**
     * 抽象类非抽象函数默认是 final
     */
    fun animateTwice() {

    }
}