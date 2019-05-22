package yidont.kotlin.ch05

/**
 * 说明
 * @author zwonb
 * @date 2019/5/22
 */
fun main() {
    val list = listOf(Person("a", 27), Person("b", 31))
    // 查找符合条件第一个元素没有就返回null
    println(list.find(canBeInClub27))
}