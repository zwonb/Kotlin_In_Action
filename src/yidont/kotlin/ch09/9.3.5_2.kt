package yidont.kotlin.ch09

/**
 * 带out投影类型参数的数据拷贝函数
 *
 * @author zwonb
 * @date 2019/6/28
 */
fun <T> copyData1(source: MutableList<out T>, destination: MutableList<T>) {
    for (item in source) {
        destination.add(item)
    }
}

fun main() {
    val list = mutableListOf(1, 2, 3)
    val anyList = mutableListOf<Any>()
    copyData1(list, anyList)
    println(anyList)
}

