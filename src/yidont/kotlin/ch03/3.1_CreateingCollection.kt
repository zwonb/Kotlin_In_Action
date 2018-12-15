package yidont.kotlin.ch03

val set = hashSetOf(1, 7, 53)
val list = arrayListOf(1, 7, 53)
val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

val strings = listOf("zwonb", "yidont", "zhongshang")
val numbers = setOf(1, 42, 6)

fun main(args: Array<String>) {
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    println(strings.last())
    println(numbers.max())
}
