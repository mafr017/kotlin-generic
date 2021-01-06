package app

class Covariant<out T>(val data: T) {
    fun data(): T {
        return data
    }
}

fun main() {
    /** Covariant
     * bisa melakuakan subtitusi subtype (child) dengan supertype (parent)
     * tidak semua jenis class generic yang mendukung covariant, hanya class generic yang menggunakan...
     * ...generic type sebagai return type function
     * ketika membuat object Contoh<String>, maka bisa disubtitusi menjadi Contoh<Any>
     */
    val covariantString = Covariant<String>("Aditya")
    val covariantAny: Covariant<Any> = covariantString

    println(covariantAny.data())
}