package app

import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

class LogObservableProperty<T>(param: T): ObservableProperty<T>(param) {
    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("Before change ${property.name} from $oldValue to $newValue")
        return true
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        println("After change ${property.name} from $oldValue to $newValue")
    }
}

class Car(brand: String, year: Int) {
    var brand: String by LogObservableProperty(brand)
    var year: Int by LogObservableProperty(year)

    var color: String by Delegates.notNull<String>()
    var owner: String by Delegates.vetoable(""){ property, oldValue, newValue ->
        println("Before change ${property.name} from $oldValue to $newValue")
        true
    }
    var country: String by Delegates.observable(""){ property, oldValue, newValue ->
        println("After change ${property.name} from $oldValue to $newValue")
    }
}

fun main() {
    /** ObservableProperty Class
     * hanya melakukan sesuatu sebelum dan sesudah data nya diubah
     */
    var car = Car("Volkswagen", 2018)
    println(car.brand)
    println(car.year)

    println()

    car.brand = "Dodge"
    car.year = 2019
    println(car.brand)
    println(car.year)

    car.color = "Black"
    println(car.color)

    car.owner = "Aditya"
    println(car.owner)

    car.country = "Indonesia"
    println(car.country)

}