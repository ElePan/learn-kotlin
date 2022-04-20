package day3.`3-patternMatching`

enum class Bit{
    Active, Disable, Init
}

fun main() {
    val x: Bit = Bit.Disable

    when (x) {
        Bit.Active -> println("active")
        Bit.Disable -> println("disable")
        Bit.Init -> println("init")
    }

    //Range
    val y = 12
    val z = listOf(1,3,5,7,9)

    when(y) {
        //condition in checked in order (from first one), when there is a match it stops
        in 1 .. 12 -> println("max 12")
        in z -> println("in z")
        !in 15 .. 17 -> println("not 15-17")
        else -> println("something else!")
    }
    //In this case it match the 1st condition and the 3rd one. But it stops at the first one (there is a "break" after a match).

    //Externals
    val a= 12
    val b = 13

    when{
        a == 17 -> println("is 17")
        a == 1 -> println("is 1")
        b == 13 -> println("is 13")
    }

    val zz = when(y) {
        in 1 .. 12 -> "max 12"
        else -> "something else!"
    } //return is a string, so zz will be automatically a string variable
}