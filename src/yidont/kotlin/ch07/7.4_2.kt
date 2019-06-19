package yidont.kotlin.ch07

/**
 * @author zwonb
 * @date 2019/6/19
 */
//class P(val x:Int, val y: Int){
//    operator fun component1() =x
//}

data class NameComponents(val name: String, val extension: String)

fun splitFilename(fullName: String): NameComponents {
    val result = fullName.split('.', limit = 2)
    return NameComponents(result[0], result[1])
}

fun splitFilename1(fullName: String): NameComponents {
    // 数组、集合也定义了解构(最多前五个)
    val (name, extension) = fullName.split('.', limit = 2)
    return NameComponents(name, extension)
}

fun main() {
//    val (name, extension) = splitFilename("example.kt")
    val (name, extension) = splitFilename1("example.kt")
    println(name)
    println(extension)
}