package yidont.kotlin.ch03

val kotlinLogo = """| //
                   .|//
                   .|/ \"""

fun main(args: Array<String>) {
    println(kotlinLogo.trimMargin("."))

    val price =  """$ {'${kotlinLogo.trimMargin(".")}'} 99.9"""
    println(price)
}