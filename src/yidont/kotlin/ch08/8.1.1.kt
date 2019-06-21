package yidont.kotlin.ch08

/**
 * 函数类型
 *
 * @author zwonb
 * @date 2019/6/21
 */
fun performRequest(
        url: String,
        callback: (code: Int, content: String) -> Unit) {
/**/
}

fun main() {
    val url = "http://kotl.in"
    performRequest(url) { code, content -> /**/ }
    performRequest(url) { code, page -> /**/ }
}