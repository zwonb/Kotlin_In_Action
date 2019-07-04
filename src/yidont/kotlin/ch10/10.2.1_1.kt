package yidont.kotlin.ch10

import kotlin.reflect.full.memberProperties

/**
 * kotlin 反射
 *
 * @author zwonb
 * @date 2019/7/4
 */
class Person(val name: String, val age: Int)

fun main() {
    val person = Person("zwonb", 22)
    val kClass = person.javaClass.kotlin
    println(kClass.simpleName)
    kClass.memberProperties.forEach { println(it.name) }
}