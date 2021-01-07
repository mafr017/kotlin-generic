package app

class TypeErasure<T>(param: T) {
    private val data: T = param
    fun  getData(): T = data
}

fun main() {
    /** Type Erasure
     * proses pengecekan generic pada saat compile time, dan menghiraukan pengecekan pada saat runtime
     * menjadikan informasi generic yang kita buat akan hilang ketika kode program kita telah dicompile menjadi binary file
     * compiler akan mengubah generic parameter type menjadi tipe Any (atau Object di Java)
     */
    val data1 = TypeErasure<String>("Adit")
    val name: String = data1.getData()

//    val data2: TypeErasure<Int> = data1 as TypeErasure<Int>
//    val dataInt = data2.getData()
//    println(dataInt)
}