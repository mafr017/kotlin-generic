package app

class Container<T>(var data: T)

fun copyContainer(from: Container<out Any>, to: Container<in Any>) {
    to.data = from.data
}

fun main() {
    /** Type Projection
     * menambahkan informasi covariant atau contravariant di parameter function, memaksa isi function untuk melakukan pengecekan
     * jika covariant, tidak boleh mengubah data generic di object
     * jika contravariant, tidak boleh mengambil data generic di object
     */
    val container1 = Container("Adit")
    val container2: Container<Any> = Container("Aditya")
    copyContainer(container1, container2)

    println(container1.data)
    println(container2.data)
}