package yidont.kotlin.ch04

/**
 * 构造函数
 *
 * @author zwonb
 * @date 2019/5/7
 */
class User(
        val nickname: String,
        val isSubscribed: Boolean = true
)

fun main() {
    val user = User("zwonb")
    println(user.isSubscribed)
    val user1 = User("Bob", false)
    println(user1.isSubscribed)
    val user2 = User("Carol", isSubscribed = false)
    println(user2.isSubscribed)
}