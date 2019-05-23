package yidont.kotlin.ch06

/**
 * 说明
 * @author zwonb
 * @date 2019/5/23
 */
class Person1(val firstName: String, val lastName: String) {
    override fun equals(other: Any?): Boolean {
        val person = other as? Person1 ?: return false
        return person.firstName == firstName && person.lastName == lastName
    }

    override fun hashCode(): Int {
        return firstName.hashCode() * 37 + lastName.hashCode()
    }
}

fun main() {
    val person = Person1("zhang", "san")
    val person1 = Person1("zhang", "san")
    println(person == person1)
    println(person.equals(42))
}


