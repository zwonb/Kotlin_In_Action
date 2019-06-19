package yidont.kotlin.ch07

import java.beans.PropertyChangeListener
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 * 使用 Delegates.observable 来实现属性修改的通知
 *
 * @author zwonb
 * @date 2019/6/19
 */
class Person5(val name: String, age: Int, salary: Int) : PropertyChangeAware() {

    private val observer = { prop: KProperty<*>, oldValue: Int, newValue: Int ->
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }

    var age: Int by Delegates.observable(age, observer)
    var salary: Int by Delegates.observable(salary, observer)
}

fun main() {
    val person = Person5("zwonb", 20, 3000)
    person.addPropertyChangeListener(PropertyChangeListener {
        println("Property ${it.propertyName} changed " +
                "from ${it.oldValue} to ${it.newValue}")
    })
    person.age = 21
    person.salary = 4500
}