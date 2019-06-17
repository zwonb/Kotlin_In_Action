package yidont.kotlin.ch06

/**
 * kotlin 和 java 集合
 *
 * @author zwonb
 * @date 2019/6/17
 */
fun printInUppercase(list: List<String>) {
    println(CollectionUtils.uppercaseAll(list))
    println(list.first())
}

fun main() {
    val list = listOf("a", "b", "c")
    printInUppercase(list)
}