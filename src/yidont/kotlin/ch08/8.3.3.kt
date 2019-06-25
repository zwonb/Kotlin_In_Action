package yidont.kotlin.ch08

import yidont.kotlin.ch01.Person

/**
 * 匿名函数：默认使用局部返回
 *
 * @author zwonb
 * @date 2019/6/25
 */
fun lookForZwonb3(people: List<Person>) {
    people.forEach(fun(person) {
        if (person.name == "zwonb") {
            // 直接返回匿名函数，从最近的一个 fun 返回
            return
        }
        println("${person.name} is not zwonb")
    })
}

fun main() {
    lookForZwonb3(people)
}