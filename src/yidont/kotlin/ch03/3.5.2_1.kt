package yidont.kotlin.ch03

/**
 * 解析文件路径信息
 */

private fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")
    println("dir:$directory, name:$fileName, ext:$extension")
}

fun main(args: Array<String>) {
    parsePath("/User/zwonb/kotlin/chapter.doc")
}