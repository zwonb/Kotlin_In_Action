package yidont.kotlin.ch04

/**
 * 通用对象方法
 *
 * @author zwonb
 * @date 2019/5/15
 */
class Client(val name: String, val postalCode: Int) {

    override fun toString(): String {
        return "Client(name='$name', postalCode='$postalCode')"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true // 对象引用的比较
        if (javaClass != other?.javaClass) return false

        other as Client

        if (name != other.name) return false
        if (postalCode != other.postalCode) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + postalCode
        return result
    }

}

fun main() {
    val client = Client("zwonb", 528400)
    println(client)

    val client1 = Client("zwonb", 528400)
    println(client == client1)

    // 如果没有重写hashCode将返回false
    val setOf = hashSetOf(Client("zwonb", 528400))
    println(setOf.contains(Client("zwonb", 528400)))
}

