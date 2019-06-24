package yidont.kotlin.ch08

/**
 * 返回函数的函数
 *
 * @author zwonb
 * @date 2019/6/24
 */
data class Person(val firstName: String, val lastName: String, val phoneNumber: String?)

class ContactListFilters {
    var prefix: String = ""
    var onlyWithPhoneNumber: Boolean = false

    fun getPredicate(): (Person) -> Boolean {
        val startWithPrefix = { p: Person ->
            p.firstName.startsWith(prefix) || p.lastName.startsWith(prefix)
        }
        if (!onlyWithPhoneNumber) {
            return startWithPrefix
        }
        return { startWithPrefix(it) && it.phoneNumber != null }
    }
}

fun main() {
    val list = listOf(Person("yuanbin", "zhou", "1234567890"),
            Person("wonb", "z", null))
    val contactListFilters = ContactListFilters()
    with(contactListFilters) {
        prefix = "yu"
        onlyWithPhoneNumber = true
    }
    println(list.filter(contactListFilters.getPredicate()))
}