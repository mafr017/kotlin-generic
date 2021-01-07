package app

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class LogReadOnlyProperty(val data: String): ReadOnlyProperty<Any, String> {
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Access property ${property.name} with value $data")
        return data.toUpperCase()
    }
}

class NameWithLog(param: String) {
    val name: String by LogReadOnlyProperty(param)
}

fun main() {
    /** ReadOnlyProperty Interface
     * interface generic yang bisa digunakan sebagai delegate property yang sifatnya ReadOnlu, alias val (immutable)
     * ReadOnlyProperty bisa digunakan sebagai delegate, sehingga sebelum data kita dikembalikan, kita bisa melakukan...
     * ...sesuatu, atau bahkan mengubah value property
     */
    val nameWithLog = NameWithLog("Aditya FR")
    println(nameWithLog.name)
    println(nameWithLog.name)
}