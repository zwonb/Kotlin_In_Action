package yidont.kotlin.ch02

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}

fun main(args: Array<String>) {
    val rectangle = Rectangle(20, 20)
    println(rectangle.isSquare)
}