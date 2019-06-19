package yidont.kotlin.ch07

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport

/**
 * 通过辅助类来实现属性变化的通知
 *
 * @author zwonb
 * @date 2019/6/19
 */
class ObservableProperty(
        val propName: String, var propValue: Int,
        val changeSupport: PropertyChangeSupport
) {
    fun getValue(): Int = propValue
    fun setValue(newValue: Int) {
        val oldValue = propValue
        propValue = newValue
        changeSupport.firePropertyChange(propName, oldValue, newValue)
    }
}


class Person3(val name: String, age: Int, salary: Int) : PropertyChangeAware() {

    val _age = ObservableProperty("age", age, changeSupport)
    var age: Int
        get() = _age.getValue()
        set(value) = _age.setValue(value)

    val _salary = ObservableProperty("salary", salary, changeSupport)
    var salary: Int
        get() = _salary.getValue()
        set(value) = _salary.setValue(value)
}

fun main() {
    val person = Person3("zwonb", 20, 3000)
    person.addPropertyChangeListener(PropertyChangeListener {
        println("Property ${it.propertyName} changed " +
                "from ${it.oldValue} to ${it.newValue}")
    })
    person.age = 21
    person.salary = 4500
}