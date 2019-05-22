package yidont.kotlin.ch05

/**
 * SAM构造方法
 * @author zwonb
 * @date 2019/5/22
 */
fun createAllDoneRunnable() : Runnable {
    return Runnable { println("All done!") }
}

fun main() {
    createAllDoneRunnable().run()
}