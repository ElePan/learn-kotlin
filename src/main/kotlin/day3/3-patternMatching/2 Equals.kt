package day3.`3-patternMatching`

fun main(){
    val a: Any = 12
    val b: Any = 12

    println(a == b) //same content
    println(a.equals(b)) //equals is a == check
    println(a === b) //same reference

    val c = listOf(12)
    val d = listOf(12)

    println(c == d) //same content
    println(c === d) //not the same instance


}