package yidont.kotlin.ch04

/**
 * 访问支持字段
 *
 * @author zwonb
 * @date 2019/5/8
 */
class User3(val name: String) {

    var address: String = "unspecified"
        set(value) {
            println("""
                Address was changed for $name:
                "$field" -> "$value".
                """.trimIndent())
            field = value
        }
}

fun main() {
    val user3 = User3("zwonb")
    user3.address = "广东省中山市东区"
}