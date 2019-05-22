package yidont.kotlin.ch05

import java.io.File

/**
 * 说明
 * @author zwonb
 * @date 2019/5/22
 */
fun File.isInsideHiddenDirectory() =
        generateSequence(this) { it.parentFile }.any { it.isHidden }

fun main() {
    val file = File("c:/User/zwonb/.android/avd")
    println(file.isInsideHiddenDirectory())
}