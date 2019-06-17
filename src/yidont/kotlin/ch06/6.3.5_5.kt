package yidont.kotlin.ch06

/**
 * @author zwonb
 * @date 2019/6/17
 */
fun main(args: Array<String>) {
    args.forEachIndexed { index, s ->
        println("argument $index is: $s")
    }
}