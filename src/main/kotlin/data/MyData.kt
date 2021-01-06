package data

class MyData<T>(val firstData: T) {

    fun getFirst(): T = firstData
//    fun getData(): T {
//        return firstData
//    }

    fun printData() {
        println("Data is $firstData")
    }

}

class MultiData<T, U>(val firstData: T, val secondData: U) {

    fun getFirst(): T = firstData
    fun getSecond(): U = secondData

    fun printlnData() {
        println("Data is $firstData and $secondData")
    }
}
