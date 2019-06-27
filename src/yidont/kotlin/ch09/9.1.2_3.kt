package yidont.kotlin.ch09

/**
 * 为二个类型参数指定多个约束
 *
 * @author zwonb
 * @date 2019/6/27
 */
fun <T> ensureTrailingPeriod(sep: T)
        where T : CharSequence, T : Appendable {
    if (!sep.endsWith('.')) {
        sep.append('.')
    }
}

fun main() {
    val builder = StringBuilder("hello world")
    ensureTrailingPeriod(builder)
    println(builder)
}