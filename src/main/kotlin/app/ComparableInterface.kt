package app

class Fruit(val name: String, val quantity: Int): Comparable<Fruit> {
    override fun compareTo(other: Fruit): Int {
        return quantity.compareTo(other.quantity)
    }
}

fun main() {
    /** Comparable Interface
     * komparasi object yang mewariskan interface generic comparable
     */
    val buah1 = Fruit("Mangga", 2)
//    val buah2 = Fruit("Apel", 10)
    val buah2 = Fruit("Mangga", 10)

    if (buah1.name == buah2.name) {
        println(buah1 > buah2)
        println(buah1 >= buah2)
        println(buah1 <= buah2)
        println(buah1 < buah2)
    } else {
        println("Can't compare different fruits")
    }
}