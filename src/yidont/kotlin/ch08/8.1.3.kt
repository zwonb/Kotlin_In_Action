@file:JvmName("ProcessTheAnswer")

package yidont.kotlin.ch08

/**
 * 在java中使用函数类
 *
 * @author zwonb
 * @date 2019/6/24
 */
fun processTheAnswer(f: (Int) -> Int) {
    println(f(42))
}