package yidont.kotlin.ch07

/**
 * 排序运算符：compareTo
 *
 * @author zwonb
 * @date 2019/6/18
 */
class Person1(val firstName: String, val lastName: String) : Comparable<Person1> {
    override fun compareTo(other: Person1): Int {
        return compareValuesBy(this, other, Person1::lastName, Person1::firstName)
    }

}

fun main() {
    val p1 = Person1("Alice", "Smith")
    val p2 = Person1("Bob", "Johnson")
    println(p1 < p2)
}