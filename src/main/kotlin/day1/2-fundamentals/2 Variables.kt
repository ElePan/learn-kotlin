package day1.`2-fundamentals`

fun main() {
    var a = 1
    //mutable variable
    a = 2
    //reassign a
    println(a)
    //Here will print a 2

    val b = 1
    //val is immutable, b = 3 is not compiling => constant, preferable in terms of performance
    print(b)
}