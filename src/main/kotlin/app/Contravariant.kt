package app

class Contravariant<in T> {
    fun sayHello(param: T) {
        println("Hello $param")
    }
}

fun main() {
    /** Contravariant
     * bisa melakukan subtitusi supertype (parent) dengan subtype (child)
     * tidak semua jenis class generic mendukung contravariant, hanya class generic yang menggunakan...
     * ...generic parameter type sebagai parameter function
     * ketika membuat object Contoh<Any>, maka bisa disubtitusi menjadi Contoh<String>
     * kebalikannya dari covariant, tidak bisa mengembalikan nilai
     */
    val contravariantAny = Contravariant<Any>()
    val contravariantString: Contravariant<String> = contravariantAny

    contravariantString.sayHello("Aditya")
}