package yidont.kotlin.ch06

/**
 * 说明
 * @author zwonb
 * @date 2019/5/23
 */
data class Person3(val name: String, val age: Int? = null) {

    fun isOlderThan(other: Person3): Boolean? {
        return if (age == null || other.age == null) {
            null
        } else {
            age > other.age
        }
    }
}

fun main() {
    println(Person3("zwonb", 22).isOlderThan(Person3("zhansan", 25)))
    println(Person3("zwonb", 22).isOlderThan(Person3("lisi")))
}