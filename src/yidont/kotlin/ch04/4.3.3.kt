package yidont.kotlin.ch04

/**
 * 委托类(使用 by 关键字)
 *
 * @author zwonb
 * @date 2019/5/15
 */
class CountingSet<T>(
        val innerSet: MutableCollection<T> = hashSetOf()
// 将MutableCollection的实现委托给innerSet
) : MutableCollection<T> by innerSet {

    var objectsAdd = 0

    /**
     * 不使用委托，提供一个实现
     */
    override fun add(element: T): Boolean {
        ++objectsAdd
        return innerSet.add(element)
    }

    /**
     * 不使用委托，提供一个实现
     */
    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdd += elements.size
        return innerSet.addAll(elements)
    }
}

fun main() {
    val set = CountingSet<Int>()
    set.addAll(listOf(1, 2, 3))
    println("${set.objectsAdd} objects were added, ${set.size} remain")
}