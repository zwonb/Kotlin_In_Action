package yidont.kotlin.ch05

/**
 * 说明
 * @author zwonb
 * @date 2019/5/22
 */
fun main() {
    val list = listOf(1, 2, 3, 4)
    println(list.map { it * it })

    val peoples = listOf(Person("zwonb", 22), Person("zhangsan", 25))
    println(peoples.map { it.name })

    val map = mapOf(0 to "zero", 1 to "one")
    println(map.mapValues { it.value.toUpperCase() })
}