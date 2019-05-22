package yidont.kotlin.ch05

/**
 * 说明
 * @author zwonb
 * @date 2019/5/22
 */
fun alphabet(): String {
    val builder = StringBuilder()
    for (letter in 'A'..'Z') {
        builder.append(letter)
    }
    builder.append("\ndone")
    return builder.toString()
}

/**
 * 使用 with
 */
fun alphabet1(): String {
    val builder = StringBuilder()
    return with(builder) {
        for (letter in 'A'..'Z') {
            this.append(letter)
        }
        append("\ndone")
        this.toString()
    }
}

/**
 * 上面的简化版
 */
fun alphabet2(): String = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\ndone")
    toString()
}

fun main() {
    println(alphabet())
    println(alphabet1())
}