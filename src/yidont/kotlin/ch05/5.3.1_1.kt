package yidont.kotlin.ch05

/**
 * 说明
 * @author zwonb
 * @date 2019/5/22
 */
fun main() {
    val list = listOf(1, 2, 3, 4)
    list.asSequence()
            // 中间操作
            .map {
                print("map$it")
                it * it
            }
            .filter {
                print("filter$it")
                it % 2 == 0
            }
            // 末端操作
            // 如果不调用末端操作，中间操作是不会执行的
            .toList()
}