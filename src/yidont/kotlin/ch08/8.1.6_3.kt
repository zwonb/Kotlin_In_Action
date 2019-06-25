package yidont.kotlin.ch08

/**
 * 通过 lambda 去除无用代码
 *
 * @author zwonb
 * @date 2019/6/25
 */
val averageMobileDuration = log
        .filter { it.os in setOf(OS.IOS, OS.ANDROID) }
        .map(SiteVisit::duration)
        .average()

fun main() {
    println(averageMobileDuration)
}