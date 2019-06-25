package yidont.kotlin.ch08

/**
 * 通过 lambda 去除无用代码
 *
 * @author zwonb
 * @date 2019/6/25
 */
fun List<SiteVisit>.averageDurationFor(os: OS) = filter { it.os == os }.map(SiteVisit::duration).average()

fun main() {
    println(log.averageDurationFor(OS.WINDOWS))
    println(log.averageDurationFor(OS.MAC))
}