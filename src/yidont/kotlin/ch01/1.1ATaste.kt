package yidont.kotlin.ch01

data class Person(val name: String, val age: Int? = null)

fun main(args: Array<String>) {

    val person1 = Person("Alice")
    val person2 = Person("Bob1", age = 20)
    val person3 = Person("Bob2", age = 22)
    val person4 = Person("Bob3", age = 26)
    val person5 = Person("Bob4", age = 28)
    val persons = listOf(person1, person2, person3, person4, person5)
    val oldest = persons.maxBy { it.age ?: 0 }
    val message = "最老的是: $oldest"
    println(message)
}