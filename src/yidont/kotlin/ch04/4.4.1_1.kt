package yidont.kotlin.ch04

import java.io.File
import java.util.*

/**
 * object关键字 (将声明一个类与创建一个实例结合起来)
 *
 * @author zwonb
 * @date 2019/5/15
 */
object CaseInsensitiveFileComparator : Comparator<File> {

    override fun compare(file1: File, file2: File): Int {
        return file1.path.compareTo(file2.path, true)
    }

}

fun main() {
    println(CaseInsensitiveFileComparator
            .compare(File("/User"), File("/user")))

    val files = listOf(File("/Z"), File("/a"))
    println(files.sortedWith(CaseInsensitiveFileComparator))
}