package yidont.kotlin.ch05

/**
 * apply
 * @author zwonb
 * @date 2019/5/22
 */
fun alphabet3() = StringBuilder().apply {
    for (c in 'A'..'Z') {
        append(c)
    }
    append("\ndone")
}.toString()

fun alphabet4() = buildString {
    for (c in 'A'..'Z') {
        append(c)
    }
    append("\ndone")
}

fun main() {
    println(alphabet3())
}