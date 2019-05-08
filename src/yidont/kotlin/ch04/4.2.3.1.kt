package yidont.kotlin.ch04

/**
 * 接口属性的实现方式
 *
 * @author zwonb
 * @date 2019/5/8
 */
interface User1 {
    val nickname: String
}

class PrivateUser(override val nickname: String) : User1

class SubscribingUser(val email: String) : User1 {

    // 定义getter属性
    override val nickname: String
        get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int) : User1 {

    // 初始化属性
    override val nickname = getFacebookName(accountId)
}

private fun getFacebookName(accountId: Int) = "fb:$accountId"

fun main() {
    println(PrivateUser("test@kotlinlang.org").nickname)
    println(SubscribingUser("test@kotlinlang.org").nickname)
}