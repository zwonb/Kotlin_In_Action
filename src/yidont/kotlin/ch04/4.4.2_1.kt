package yidont.kotlin.ch04

/**
 * 伴生对象
 *
 * @author zwonb
 * @date 2019/5/15
 */
class A {
    companion object {
        fun bar(){
            println("hello!")
        }
    }
}

fun main() {
    A.bar()
}