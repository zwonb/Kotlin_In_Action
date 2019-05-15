package yidont.kotlin.ch04

/**
 * 说明
 * @author zwonb
 * @date 2019/5/15
 */
class Person1(val name: String) {

    /**
     * 命名伴生对象
     */
    companion object Loader {
        fun fromJson() = Unit
    }
}

interface JSONFactory<T> {
    fun fromJson(string: String): T

    fun loadFromJson(factory: JSONFactory<T>){}
}

class Person3(val name: String) {

    /**
     * 伴生对象实现接口
     */
    companion object : JSONFactory<Person3> {

        override fun fromJson(string: String): Person3 {

            loadFromJson(Person3)

            return Person3("zwonb")
        }
    }
}