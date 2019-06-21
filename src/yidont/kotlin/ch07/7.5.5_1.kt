package yidont.kotlin.ch07

/**
 * 在 map 中保存属性值
 *
 * @author zwonb
 * @date 2019/6/21
 */
class Person6 {

    private val _attributes = hashMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    val name: String
        get() = _attributes["name"]!!
}

fun main() {
    val person = Person6()
    val map = mapOf("name" to "zwonb", "company" to "yidont")
    for ((key, value) in map) {
        person.setAttribute(key, value)
    }
    println(person.name)
}