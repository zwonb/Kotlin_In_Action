package yidont.kotlin.ch04

/**
 * 接口
 *
 * @author zwonb
 * @date 2019/5/8
 */
interface User2 {

    val email: String

    val nickname: String
        get() = email.substringBefore('@')
}