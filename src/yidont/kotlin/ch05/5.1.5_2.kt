package yidont.kotlin.ch05

/**
 * 说明
 * @author zwonb
 * @date 2019/5/21
 */
fun main() {
    // 构造方法引用 存储或者延期执行创建类实例的动作
    val createPerson = ::Person
    val person = createPerson("zwonb", 22)
    println(person)
}