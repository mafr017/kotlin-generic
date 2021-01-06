package app

class Invariant<T>(val data: T)

fun main() {
    /** Invariant
     * secara defautl sifat parmeter dari generic parameter type adalah invariant
     * invariant artinya tidak boleh di subtitusi dengan subtype (child) atau supertype (parent)
     * saat membuat object Contoh<String>, maka tidak sama dengan Contoh<Any>, begitupun sebaliknya
     */
    val invariantString = Invariant("String")
    val invariantAny: Invariant<Any> = invariantString //tidak bisa
}