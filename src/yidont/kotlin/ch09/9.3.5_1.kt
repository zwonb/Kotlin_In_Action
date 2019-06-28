package yidont.kotlin.ch09

/**
 * 带不变类型参数的数据拷贝函数
 *
 * @author zwonb
 * @date 2019/6/28
 */
fun <T: R, R> copyData(source: MutableList<T>, destination: MutableList<R>) {
    for (item in source) {
        destination.add(item)
    }
}

fun main() {
    val list = mutableListOf(1, 2, 3)
    val anyList = mutableListOf<Any>()
    copyData(list, anyList)
    println(anyList)
}