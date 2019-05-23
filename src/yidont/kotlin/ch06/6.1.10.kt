package yidont.kotlin.ch06

/**
 * 说明
 * @author zwonb
 * @date 2019/5/23
 */
/**
 * 泛型默认是可为空的
 */
fun <T> printHashCode(t: T) {
    println(t?.hashCode())
}

/**
 * 指定类型Any不为空
 */
fun <T: Any> printHashCode1(t: T) {
    println(t.hashCode())
}

fun main() {
    printHashCode(null)
}