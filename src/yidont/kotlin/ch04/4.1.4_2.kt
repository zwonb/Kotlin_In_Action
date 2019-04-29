package yidont.kotlin.ch04

class Outer {

    /**
     * 内部类，可以访问外部类对象
     */
    inner class Inner {
        fun getOuter(): Outer = this@Outer
    }
}