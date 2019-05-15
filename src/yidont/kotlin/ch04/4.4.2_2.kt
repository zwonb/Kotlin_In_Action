package yidont.kotlin.ch04

/**
 * 说明
 * @author zwonb
 * @date 2019/5/15
 */
// 主构造方法私有
class User4 private constructor(val nickname: String) {

    // 伴生对象
    companion object {
        fun newSubscribingUser(email: String) =
                User4(email.substringBefore('@'))

        // 工厂方法来创建对象
        fun newFacebookUser(accountId: Int) =
                User4(getFacebookName4(accountId))
    }
}

fun getFacebookName4(accountId: Int) = "fb:$accountId"

fun main() {
    val user = User4.newSubscribingUser("zhouyb@yidont.com")
    val facebookUser = User4.newFacebookUser(1140114702)
    println(user.nickname)
    println(facebookUser.nickname)
}
