package yidont.kotlin.ch04

/**
 * 密封类
 */

sealed class Expr1 {
    class Num(val value: Int) : Expr1()
    class Sum(val left: Expr1, val right: Expr1) : Expr1()
}

fun eval(e: Expr1): Int =
        when (e) {
            is Expr1.Num -> e.value
            is Expr1.Sum -> eval(e.left) + eval(e.right)
        }

fun main(args: Array<String>) {
    println(eval(Expr1.Sum(Expr1.Sum(Expr1.Num(1), Expr1.Num(2)), Expr1.Num(4))))
}