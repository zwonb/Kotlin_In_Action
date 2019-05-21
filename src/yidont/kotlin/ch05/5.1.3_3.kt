package yidont.kotlin.ch05

/**
 * 说明
 * @author zwonb
 * @date 2019/5/21
 */
fun main() {
    val list = listOf(Person("zwonb", 22), Person("zhangsan", 21))
    val names = list.joinToString(separator = " ", transform = { person -> person.name })

    // 可以把lambda放到后面传递
//    val names1 = list.joinToString(" ") { person -> person.name }
    println(names)
}