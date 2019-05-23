package yidont.kotlin.ch06

/**
 * 说明
 * @author zwonb
 * @date 2019/5/23
 */
fun printShippingLabel(person: Person) {
    val address = person.company?.address ?: throw IllegalArgumentException("无地址")
    with(address) {
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}

fun main() {
    val address = Address("东区街道长江路6号", 528400, "中山", "中山")
    val company = Company("yidont", address)
    val person = Person("zwonb", company)
    printShippingLabel(person)
    printShippingLabel(Person("zhangsan", null))
}