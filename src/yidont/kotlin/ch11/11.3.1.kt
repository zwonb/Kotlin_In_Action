package yidont.kotlin.ch11

/**
 * 在类中定义一个invoke方法
 *
 * @author zwonb
 * @date 2019/7/8
 */
class Greeter(val greeting: String) {
    operator fun invoke(name: String) {
        println("$greeting, $name")
    }
}

fun main() {
    val greeter = Greeter("Hello")
    greeter("zwonb")
}