package yidont.kotlin.ch02

private fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz"
    i % 5 == 0 -> "Fizz"
    i % 3 == 0 -> "Buzz"
    else -> "$i"
}

fun main(args: Array<String>) {
//    表示从1(包含)到100(包含)的迭代
    for (i in 1..100) {
        println(fizzBuzz(i))
    }
}