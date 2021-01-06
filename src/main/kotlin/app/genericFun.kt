package app

import data.Function

fun main() {
    /** Generic Function
     * generic parameter type yang dideklarasikan di function, hanya bisa diakses di function tersebut, tidak bisa...
     * ...digunakan diluar function
     * cocok ketika ingin membuat generic function, tanpa harus mengubah deklarasi class
     */
    val generifFun = Function("Aditya")

    generifFun.sayHello("Kotlin")
    generifFun.sayHello(2000)
    generifFun.sayHello<Float>(2000F)
    generifFun.sayHello<Double>(2000.22)
}