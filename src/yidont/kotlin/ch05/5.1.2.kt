package yidont.kotlin.ch05

/**
 * 说明
 * @author zwonb
 * @date 2019/5/21
 */
data class Person(val name: String, val age: Int)


fun findTheOldest(people: List<Person>) {
    var maxAge = 0
    var theOldest: Person? = null
    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }
    println(theOldest)
}

fun main() {
    val list = listOf(Person("zwonb", 22), Person("zhangsan", 21))
    findTheOldest(list)

    // 使用maxBy
    // 可以简写成下面的
//    val person2 = list.maxBy({ p: Person -> p.age })
    val person = list.maxBy { it.age }
//    val person1 = list.maxBy(Person::age)
    println(person)
}