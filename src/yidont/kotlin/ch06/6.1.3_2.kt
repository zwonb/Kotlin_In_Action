package yidont.kotlin.ch06

/**
 * 说明
 * @author zwonb
 * @date 2019/5/23
 */
class Employee(val name: String, val manager: Employee?)

fun mangerName(employee: Employee): String? = employee.manager?.name

fun main() {
    val employee = Employee("zhangsan", null)
    val zwonb = Employee("zwonb", employee)
    println(mangerName(zwonb))
    println(mangerName(employee))
}