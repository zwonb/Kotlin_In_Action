package yidont.kotlin.ch07

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport

/**
 * 实现委托属性
 *
 * @author zwonb
 * @date 2019/6/19
 */
open class PropertyChangeAware {
    protected val changeSupport = PropertyChangeSupport(this)

    fun addPropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.addPropertyChangeListener(listener)
    }

    fun removePropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.removePropertyChangeListener(listener)
    }
}

class Person2(val name: String, age: Int, salary: Int) : PropertyChangeAware() {
    var age: Int = age
        set(newValue) {
            val oldValue = field
            field = newValue
            changeSupport.firePropertyChange("age", oldValue, newValue)
        }

    var salary: Int = salary
        set(newValue) {
            val oldValue = field
            field = newValue
            changeSupport.firePropertyChange("salary", oldValue, newValue)
        }
}

fun main() {
    val person = Person2("zwonb", 20, 3000)
    person.addPropertyChangeListener(PropertyChangeListener {
        println("Property ${it.propertyName} changed " +
                "from ${it.oldValue} to ${it.newValue}")
    })
    person.age = 21
    person.salary = 4500
}