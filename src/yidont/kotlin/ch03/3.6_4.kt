package yidont.kotlin.ch03

/**
 * 拓展函数，局部函数
 */
fun User.validateBeforeSave() {

    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                    "Can't save user $id: empty $fieldName")
        }
    }

    validate(name, "Name")
    validate(address, "Address")
}

private fun saveUser(user: User) {
    user.validateBeforeSave()

    // Save user to the database
}

fun main(args: Array<String>) {
    saveUser(User(1, "", ""))
}