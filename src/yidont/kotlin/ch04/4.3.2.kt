package yidont.kotlin.ch04

/**
 * 数据类(自动生成通用方法的实现)
 *
 * @author zwonb
 * @date 2019/5/15
 */
data class Client1(val name: String, val postalCode: Int)

fun main() {
    val client = Client1("zwonb", 528400)
    val client1 = Client1("zwonb", 528400)
    println(client == client1)
    println(client.copy(postalCode = 520000))
}