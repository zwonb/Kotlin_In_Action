package yidont.kotlin.ch06

/**
 * 说明
 * @author zwonb
 * @date 2019/5/23
 */
fun ignoreNulls(s: String?) {
    val sNotNull :String= s!!
    println(sNotNull.length)
}

fun main() {
    ignoreNulls(null)
}