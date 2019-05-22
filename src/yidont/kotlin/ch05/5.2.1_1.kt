package yidont.kotlin.ch05

/**
 * 集合类的函数式 api
 * @author zwonb
 * @date 2019/5/22
 */
fun main() {
    val list = listOf(1, 2, 3, 4)
    println(list.filter { it % 2 == 0 })

    val peoples = listOf(Person("a", 21), Person("b", 25), Person("c", 35))
    println(peoples.filter { it.age > 25 })
}