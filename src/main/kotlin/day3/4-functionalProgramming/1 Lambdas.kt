package day3.`4-functionalProgramming`

fun main() {
    //No named lambdas are like anonym classes, instanced for every use

    val intToString = { x: Int -> x.toString()}
    //intToString type (Int) -> string: it means thye type is a function that receive an int as input and return a string
    println(intToString(7))

    val charsOfAString = fun(s: String):Int {return s.length}
    //charsOfAString type (string) -> int, you can specify it but it is not needed
    println(charsOfAString("hey"))

    val l = listOf(1,2,3,4)

    val xTen = l.map{ x -> x * 10}
    println(xTen)

    val xTenString = l.map{ x -> x * 10}.map(intToString)
    println(xTenString)
}
