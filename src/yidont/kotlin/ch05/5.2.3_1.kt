package yidont.kotlin.ch05

/**
 * 说明
 * @author zwonb
 * @date 2019/5/22
 */
fun main() {
    val list = listOf(Person("a", 31), Person("zwonb", 22), Person("b", 31))
    // 返回一个Map<K,List<T>>,根据age进行分组
    // {31=[Person(name=a, age=31), Person(name=b, age=31)], 22=[Person(name=zwonb, age=22)]}
    println(list.groupBy { it.age })

    val list1 = listOf("a", "ab", "b")
    println(list1.groupBy(String::first))
}