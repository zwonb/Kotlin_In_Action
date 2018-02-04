package yidont.kotlin.ch02

import java.util.*

class Rectangle1(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}

fun createRandomRectangle(): Rectangle1 {
    val random = Random()
    return Rectangle1(random.nextInt(), random.nextInt())
}