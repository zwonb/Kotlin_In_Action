package yidont.kotlin.ch06

/**
 * 只读集合与可变集合
 *
 * @author zwonb
 * @date 2019/6/14
 */
fun <T> copyElements(source: Collection<T>, target: MutableCollection<T>) {
    // Collection只提供只读接口，MutableCollection提供修改的接口
    for (item in source) {
        target.add(item)
    }
}

fun main() {
    val source: Collection<Int> = arrayListOf(3, 5, 7)
    val target: MutableCollection<Int> = arrayListOf(1)
    copyElements(source, target)
    println(target)
}