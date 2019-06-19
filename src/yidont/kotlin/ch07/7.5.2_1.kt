package yidont.kotlin.ch07

/**
 * 使用委托属性：惰性初始化和 “by lazy()”
 *
 * @author zwonb
 * @date 2019/6/19
 */
class Email { /**/ }

fun loadEmails(person: Person): List<Email> {
    println("Load emails for ${person.name}")
    return listOf(/**/)
}

class Person(val name: String) {
    private var _emails: List<Email>? = null

    val emails: List<Email>
        get() {
            if (_emails == null) {
                _emails = loadEmails(this)
            }
            return _emails!!
        }

    // 可以使用by lazy实现惰性初始化
    val emails1 by lazy { loadEmails(this) }
}

fun main() {
    val person = Person("zwonb")
    // 只输出一次，第二次不为空
    person.emails
    person.emails
}
