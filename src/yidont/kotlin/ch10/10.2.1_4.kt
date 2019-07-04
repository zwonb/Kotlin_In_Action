package yidont.kotlin.ch10

/**
 * 反射调用属性
 *
 * @author zwonb
 * @date 2019/7/4
 */
fun main() {
    val person = Person("zonwb", 22)
    val kProperty1 = Person::name
    println(kProperty1.get(person))

    buildString { append("dd") }
}