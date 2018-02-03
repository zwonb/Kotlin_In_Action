package yidont.kotlin.ch02

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
} // 这个函数有代码块体

// 上面的变形，更简单
fun max1(a: Int, b: Int): Int = if (a > b) a else b // 这个函数有表达式体

// 可以省略掉返回类型, 没有显式的写出返回类型，编译器会分析函数体的表达式，称为“类型推导”
fun max2(a: Int, b: Int) = if (a > b) a else b

fun main(args: Array<String>) {
    println(max(1, 2))
    println(max1(3, 4))
    println(max2(5, 6))
}