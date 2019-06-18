package yidont.kotlin.ch07

/**
 * @author zwonb
 * @date 2019/6/18
 */
fun main() {
    val list = arrayListOf(1, 2)
    list += 3
    val newList = list + listOf(4, 5)
    println(list)
    println(newList)
}