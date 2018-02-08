package yidont.kotlin.ch02

// 检查区间
fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'

fun main(args: Array<String>) {
    println(isLetter('e'))
    println(isNotDigit('3'))
}