package yidont.kotlin.ch11

/**
 * 使用invoke来支持灵活的DSL语法
 *
 * @author zwonb
 * @date 2019/7/8
 */
class DependencyHandler {
    fun compile(coordinate: String) {
        println("Added dependency on $coordinate")
    }

    operator fun invoke(body: DependencyHandler.() -> Unit) {
        body()
    }
}

fun main() {
    val dependency = DependencyHandler()
    dependency.compile("com.zwonb.util:1.1.0")
    dependency {
        compile("com.zwonb.util:1.1.0")
    }
}