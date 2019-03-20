package yidont.kotlin.ch03

private fun saveUser(user: User) {

    /**
     * 局部函数
     */
    fun validate(user: User,
                 value: String,
                 fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                    "Can't save user ${user.id}: empty $fieldName")
        }
    }

    validate(user, user.name, "Name")
    validate(user, user.address, "Address")

    // Save user to the database
}

fun main(args: Array<String>) {
    saveUser(User(1, "", ""))
}