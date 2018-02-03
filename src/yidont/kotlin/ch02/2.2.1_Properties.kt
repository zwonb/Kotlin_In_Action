package yidont.kotlin.ch02

class Person(
        val name: String,
        var isMarried: Boolean
)

fun main(args: Array<String>) {
    val person = Person("zwonb", false)
    println(person.name)
    println(person.isMarried)
    println(person)
}