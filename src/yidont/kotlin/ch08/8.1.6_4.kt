package yidont.kotlin.ch08

/**
 * 通过 lambda 去除无用代码
 *
 * @author zwonb
 * @date 2019/6/25
 */
fun List<SiteVisit>.averageDurationFor1(predicate: (SiteVisit) -> Boolean) =
        filter(predicate).map(SiteVisit::duration).average()

fun main() {
    println(log.averageDurationFor1 { it.os in setOf(OS.ANDROID, OS.IOS) })
    println(log.averageDurationFor1 { it.os == OS.IOS && it.path == "/register" })
}