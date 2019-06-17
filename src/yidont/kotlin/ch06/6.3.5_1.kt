package yidont.kotlin.ch06

/**
 * 对象和基本数据类型的数组
 *
 * @author zwonb
 * @date 2019/6/17
 */
fun main(args: Array<String>) {
    for (index in args.indices) {
        println("Argument $index is: ${args[index]}")
    }
}