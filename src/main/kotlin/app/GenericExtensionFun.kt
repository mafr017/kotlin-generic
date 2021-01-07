package app

class Data<T>(val data: T)

fun Data<String>.printString() {
    val string = this.data
    println("String value is $string")
}
fun Data<Int>.printInt() {
    val string = this.data
    println("Integer value is $string")
}

fun main() {
    /** Generic Extension Function
     * generic bisa juga digunakan pada extension function
     */
    val data1: Data<String> = Data("Kotlin")
    val data2: Data<Int> = Data(2021)

    data1.printString()
    data2.printInt()
}