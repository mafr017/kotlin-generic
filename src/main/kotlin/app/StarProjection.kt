package app

fun displayLengthArray(array: Array<*>) {
    println("Length Array is ${array.size}")
}

fun printFirst(array: Array<*>) {
    if (array.isNotEmpty()) {
        println("First element is ${array.first()}")
    }
}

fun main() {
    /** Star Projection
     * kasus dimana tidak peduli dengan generic parameter type pada object
     * ketika mengambil panjang data Array<T>, dan tidak peduli dengan isi data T nya
     * pada kasus ini bisa menggunakan Star Projection, dengan mengganti generic parameter type dengan " * " bintang
     */
    val arrayInt: Array<Int> = arrayOf(1,2,3,4,5,6)
    val arrayString: Array<String> = arrayOf("Kotlin", "Java", "Flutter", "Dart", "React Native")
    val arrayMIX = arrayOf("Aditya", 22, "Liverpool", 96, 2000.2, "Kotlin", 2021F)
    displayLengthArray(arrayInt)
    displayLengthArray(arrayString)
    displayLengthArray(arrayMIX)

    println()

    printFirst(arrayInt)
    printFirst(arrayString)
    printFirst(arrayMIX)

    println()

    println(arrayInt.size)
    println(arrayString.size)
    println(arrayMIX.size)

    println()

    println(arrayInt.first())
    println(arrayString.first())
    println(arrayMIX.first())
}