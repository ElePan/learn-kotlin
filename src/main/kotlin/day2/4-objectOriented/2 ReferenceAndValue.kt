package day2.`4-objectOriented`

fun main() {
    //basic type = nut nullable

    fun double(x: Int) : Int = x.inc().inc()
    println(double(3)) //create a new object with incremented value, as int is not mutable
    //We pass the value and not the reference

    fun doubleNullable(x: Int?) : Int? = x?.inc()?.inc()
    println(doubleNullable(30)) //in memory modify the object, as int? is mutable
    //We pass the reference and not the value
    println(doubleNullable(null))

    fun doubleList(x: MutableList<Int>) : MutableList<Int> {
        x.add(12)
        return x
    }

    val c: MutableList<Int> = mutableListOf(5)
    println(doubleList(c)) //We pass the reference and not the value
    println(c) //C is modified, now the 12 is in the list

    //object, passed as reference
    //basic types, passed as value

}