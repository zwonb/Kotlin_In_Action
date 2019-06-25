package yidont.kotlin.ch08

import yidont.kotlin.ch01.Person

/**
 * 从 lambda 返回：使用标签返回
 *
 * @author zwonb
 * @date 2019/6/25
 */

/**
 * 用一个标签实现局部返回
 */
fun lookForZwonb1(people: List<Person>) {
    people.forEach label@{
        if (it.name == "zwonb") {
            return@label
        }
    }
    println("zwonb might be somewhere")
}

/**
 * 用函数名作为 return 标签
 */
fun lookForZwonb2(people: List<Person>) {
    people.forEach {
        if (it.name == "zwonb") {
            return@forEach
        }
    }
    println("zwonb might be somewhere")
}

fun main() {
    lookForZwonb1(people)
}