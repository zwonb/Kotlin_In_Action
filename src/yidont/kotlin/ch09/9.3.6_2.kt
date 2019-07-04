package yidont.kotlin.ch09

import kotlin.reflect.KClass

/**
 * 星号投影的类型
 *
 * @author zwonb
 * @date 2019/6/28
 */
interface FieldValidator<in T> {
    fun validator(input: T): Boolean
}

object DefaultStringValidator : FieldValidator<String> {
    override fun validator(input: String): Boolean = input.isNotEmpty()
}

object DefaultIntValidator : FieldValidator<Int> {
    override fun validator(input: Int): Boolean = input >= 0
}

fun main() {
    val map = mutableMapOf<KClass<*>, FieldValidator<*>>()
    map[String::class] = DefaultStringValidator
    map[Int::class] = DefaultIntValidator
}