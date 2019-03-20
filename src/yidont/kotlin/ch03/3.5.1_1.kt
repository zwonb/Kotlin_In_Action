package yidont.kotlin.ch03

fun main(args: Array<String>) {
    println("12.345-6.A".split("\\.|-".toRegex()))

    println("12.345-6.A".split(".", "-"))
}