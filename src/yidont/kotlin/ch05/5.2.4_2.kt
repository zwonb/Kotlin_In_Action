package yidont.kotlin.ch05

/**
 * 说明
 * @author zwonb
 * @date 2019/5/22
 */
data class Book(val title: String, val authors: List<String>)

fun main() {
    val list = listOf(Book("book1", listOf("name1")),
            Book("book2", listOf("name2")),
            Book("book3", listOf("name2", "name3")))
    println(list.flatMap { it.authors }.toSet())
}