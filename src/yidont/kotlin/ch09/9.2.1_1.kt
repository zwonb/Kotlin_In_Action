package yidont.kotlin.ch09

/**
 * 对泛型类型做类型转换
 *
 * @author zwonb
 * @date 2019/6/27
 */
fun printSum(c: Collection<*>) {
    val list = c as? List<Int> ?: throw IllegalArgumentException("List is expected")
    println(list.sum())
}

fun main() {
    printSum(listOf(1, 2, 3))
    // 下面两行报错
//    printSum(setOf(1, 2, 3))
//    printSum(listOf("a", "b", "c"))
}