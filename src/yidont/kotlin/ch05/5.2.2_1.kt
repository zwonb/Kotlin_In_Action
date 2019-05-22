package yidont.kotlin.ch05

/**
 * 说明
 * @author zwonb
 * @date 2019/5/22
 */
val canBeInClub27 = { p: Person -> p.age <= 27 }

fun main() {
    val list = listOf(Person("a", 27), Person("b", 31))
    println(list.all(canBeInClub27))

    val list1 = listOf(1, 2, 3, 4)
    println(!list1.all { it == 3 })
    // 如果存在任何一个元素不等于3返回true
    println(list1.any { it != 3 })
}