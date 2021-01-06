package app

import data.MultiData
import data.MyData

fun main() {
    /** Generic Type
     * class atau interface yang memiliki parameter type
     * biasanya hanya menggunakan 1 karakter sebagai generi parameter type
     * E - Element
     * K - Key
     * N - Number
     * T - Type
     * V - Value
     * S,U,V etc. - 2nd, 3rd, 4th types
     */
    val myFirstDataStr: MyData<String> = MyData<String>("Aditya")
    myFirstDataStr.printData()

    val myFirstDataInt: MyData<Int> = MyData<Int>(19)
    myFirstDataInt.printData()

    /** Multiple Parameter Type
     * parameter type di Generic type boleh lebih dari satu
     * namun harus menggunakan nama type yang berbeda
     * sangat berguna ketika ingin membuat generic parameter type yang banyak
     */
    val myMultiData: MultiData<String, Int> = MultiData<String, Int>("Aditya", 22)
    myMultiData.printlnData()

    val myMultiData2: MultiData<Int, String> = MultiData(17, "Erika")
    myMultiData2.printlnData()

    val myMultiData3 = MultiData("Chiki", 1_000L)
    myMultiData3.printlnData()
}