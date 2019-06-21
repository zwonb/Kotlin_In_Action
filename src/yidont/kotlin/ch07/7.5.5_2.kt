package yidont.kotlin.ch07

/**
 * 在 map 中保存属性值 by委托
 *
 * @author zwonb
 * @date 2019/6/21
 */
class Person7 {
    private val _attributes = hashMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    val name: String by _attributes
}

fun main() {
    val p = Person7()
    val data = mapOf("name" to "Dmitry", "company" to "JetBrains")
    for ((attrName, value) in data)
        p.setAttribute(attrName, value)
    println(p.name)
}