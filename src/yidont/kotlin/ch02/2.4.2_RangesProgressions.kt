package yidont.kotlin.ch02

private fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz"
    i % 5 == 0 -> "Fizz"
    i % 3 == 0 -> "Buzz"
    else -> "$i"
}

fun main(args: Array<String>) {
//    表示从100(包含)到1(包含)的步长为2的迭代
    for (i in 100 downTo 1 step 2) {
        println(fizzBuzz(i))
    }
}