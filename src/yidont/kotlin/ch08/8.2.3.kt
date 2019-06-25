package yidont.kotlin.ch08

import yidont.kotlin.ch01.Person

/**
 * 内联集合操作
 *
 * @author zwonb
 * @date 2019/6/25
 */
val people = listOf(Person("zwonb", 22), Person("bob", 31))

fun main() {
    println(people.filter { it.age!! < 30 })

    println(people.filter { it.age!! > 30 }.map(Person::name))
}