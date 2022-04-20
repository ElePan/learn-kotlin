package day3.`2-deepClasses`

class Extern {
    private val twelve = 12

    //An inner class is created inside another one and can access variables of "father class"
    inner class Inside {
        fun seeNumber() = twelve
    }
}

fun main() {
    val x = Extern().Inside()
    //I need an instance of the external class to be able to instance inside one
    println(x.seeNumber())

}