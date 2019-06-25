package yidont.kotlin.ch08

import yidont.kotlin.ch01.Person

/**
 * lambda 中的返回语句：从一个封闭的函数返回
 *
 * @author zwonb
 * @date 2019/6/25
 */
fun lookForAlice(people: List<Person>) {
    for (person in people) {
        if (person.name == "zwonb") {
            println("find zwonb")
            return
        }
    }
    println("zwonb is not find")
}

fun lookForZwonb(people: List<Person>) {
    people.forEach {
        if (it.name == "zwonb") {
            println("find zwonb")
            return
        }
    }
    println("zwonb is not find")
}

fun main() {
    lookForAlice(people)
    lookForZwonb(people)
}