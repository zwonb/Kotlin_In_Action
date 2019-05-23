package yidont.kotlin.ch06

/**
 * 说明
 * @author zwonb
 * @date 2019/5/23
 */
fun showProgress(progress: Int) {
    val coerceIn = progress.coerceIn(0, 100)
    println(coerceIn)
}

fun main() {
    showProgress(146)
}