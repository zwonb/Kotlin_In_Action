package yidont.kotlin.ch04

/**
 * 修改访问器的可见性
 *
 * @author zwonb
 * @date 2019/5/15
 */
class LengthCounter {

    var counter: Int = 0
        // 不能在类的外部修改这个属性
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}

fun main() {
    val counter = LengthCounter()
    counter.addWord("hello!")
    println(counter.counter)
    // 报错不能赋值
//    counter.counter = 4
}