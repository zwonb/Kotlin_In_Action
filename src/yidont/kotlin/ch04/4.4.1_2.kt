package yidont.kotlin.ch04

/**
 * 说明
 * @author zwonb
 * @date 2019/5/15
 */
data class Person(val name: String){

    // 嵌套类实现比较器
    object NameComparator : Comparator<Person> {
        override fun compare(o1: Person, o2: Person): Int {
            return o1.name.compareTo(o2.name)
        }

    }
}

fun main() {
    val list = listOf(Person("zwonb"), Person("alice"))
    println(list.sortedWith(Person.NameComparator))
}