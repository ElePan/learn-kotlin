package day3.`2-deepClasses`

fun main() {

    data class Simple(val name: String, var legs: Int, var old: Long)
    //similar to Java Records (records are read only, difference with data classes)

    val x = Simple("Pepe", 4, 20L)

    println(x) //the toString of data class is good, no override needed

    x.legs=2
    x.old += 21L
    //Modify the object (reference)
    println(x)

    val z = x.copy(name="Pepe") //This creates a new element in memory (new reference)
    println(z)
    println(x == z) //equals by content -> should be true
    println(x === z) //equals memory reference -> should be false
}
