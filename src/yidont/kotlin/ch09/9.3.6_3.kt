package yidont.kotlin.ch09

import kotlin.reflect.KClass

/**
 * 星号投影-封装对验证器集合的访问
 *
 * @author zwonb
 * @date 2019/6/28
 */
object Validators {
    private val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()

    fun <T : Any> registerValidator(kClass: KClass<T>, fieldValidator: FieldValidator<T>) {
        validators[kClass] = fieldValidator
    }

    /**
     * 把不安全的验证在内部实现，让调用的更安全
     */
    @Suppress("unchecked_cast")
    operator fun <T : Any> get(kClass: KClass<T>): FieldValidator<T> =
            validators[kClass] as? FieldValidator<T>
                    ?: throw IllegalArgumentException("No validator for ${kClass.simpleName}")
}

fun main() {
    Validators.registerValidator(String::class, DefaultStringValidator)
    Validators.registerValidator(Int::class, DefaultIntValidator)
    println(Validators[String::class].validator("zwonb"))
    println(Validators[Int::class].validator(42))
}