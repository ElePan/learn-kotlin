package day1.`6-numbers`

fun main() {
    val a = 22
    val b = 42

    println(a + b)
    println(a.plus(b))
    println(a - b)
    println(a.minus(b))
    println(a / b)
    println(a.div(b))
    println(a * b)
    println(a.times(b))
    println(a % b)
    println(a.mod(b))
    println(a.inc())
    println(a.dec())

    var c = 22
    //to work with ++ and -- is needed a mutable value
    println(c++) //return value and add -> should be 22
    //it means c = c + 1
    println(c) //should be 23
    println(++c) //add and return value, should be 24

    // same logic with c--

    println(Int.MAX_VALUE)
    println(Integer.MAX_VALUE)
    //Int and Integer are equals?
}