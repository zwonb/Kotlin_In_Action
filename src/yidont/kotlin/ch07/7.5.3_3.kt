package yidont.kotlin.ch07

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport
import kotlin.reflect.KProperty

/**
 * ObservableProperty 作为属性委托
 *
 * @author zwonb
 * @date 2019/6/19
 */
class ObservableProperty1(var propValue: Int, val changeSupport: PropertyChangeSupport) {

    operator fun getValue(p: Person4, prop: KProperty<*>): Int = propValue

    operator fun setValue(p: Person4, prop: KProperty<*>, newValue: Int) {
        val oldValue = propValue
        propValue = newValue
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }
}

class Person4(val name: String, age: Int, salary: Int) : PropertyChangeAware() {
    var age: Int by ObservableProperty1(age, changeSupport)
    var salary: Int by ObservableProperty1(salary, changeSupport)
}

fun main() {
    val person = Person4("zwonb", 20, 3000)
    person.addPropertyChangeListener(PropertyChangeListener {
        println("Property ${it.propertyName} changed " +
                "from ${it.oldValue} to ${it.newValue}")
    })
    person.age = 21
    person.salary = 4500
}