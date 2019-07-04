package yidont.kotlin.ch09

/**
 * 带in投影类型参数的数据拷贝函数
 *
 * @author zwonb
 * @date 2019/6/28
 */
fun <T> copyData2(source: MutableList<T>, destination: MutableList<in T>) {
    for (item in source) {
        destination.add(item)
    }
}

fun main() {
    val list = mutableListOf(1, 2, 3)
    val anyList = mutableListOf<Any>()
    copyData2(list, anyList)
    println(anyList)
}