package yidont.kotlin.ch06

/**
 * 说明
 * @author zwonb
 * @date 2019/5/23
 */
fun yellAtSafe(person: Person4) {
    println((person.name ?: "zwonb").toUpperCase() + "!!!")
}

fun main() {
    yellAtSafe(Person4(null))
}