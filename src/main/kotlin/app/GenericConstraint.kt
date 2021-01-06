package app

interface CanSayHello {
    fun sayHello(name: String)
}

open class Employee

class Manager : Employee()

class VicePresident : Employee()

class SuperManager : Employee(), CanSayHello {
    override fun sayHello(name: String) {
        println("Hello $name")
    }
}

class Company<T : Employee>(val employee: T)
class Company2<T>(val employee: T) where T : Employee, T : CanSayHello

fun main() {
    /** Generic Constraint
     * membatasi data yang boleh digunakan di generic parameter type
     * dengan menambahkan constraint di generic parameter type dengan menyebutkan tipe yang diperbolehkan
     * secara otomatis, type data yang bisa digunakan adalah type yang sudah disebutkan atau class-class turunannya
     * secara default constraint type untuk generic parameter type adalah Any
     */
    val data1 = Company(Employee())
    val data2 = Company(Manager())
    val data3 = Company(VicePresident())
//    val data4 = Company("Error")

    /** Where Keyword
     * membatasi tipe data dengan beberapa jenis tipe data di generic parameter type
     * menggunakan kata kunci " where "
     */
//    val dataa1 = Company2(Employee()) // error
//    val dataa2 = Company2(Manager()) // error
//    val dataa3 = Company2(VicePresident()) // error
    val dataa4 = Company2(SuperManager())
}